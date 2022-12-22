/*
 * Copyright (C) 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sonatype.maven.polyglot.ruby;

import static org.jruby.embed.LocalContextScope.SINGLETON;
import static org.jruby.embed.LocalVariableBehavior.PERSISTENT;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.ModelReader;
import org.codehaus.plexus.component.annotations.Requirement;
import org.codehaus.plexus.util.FileUtils;
import org.codehaus.plexus.util.IOUtil;
import org.jruby.embed.ScriptingContainer;
import org.sonatype.maven.polyglot.io.ModelReaderSupport;

/**
 * Ruby model reader.
 * 
 * @author mkristian
 * @since 0.8
 */
abstract public class AbstractRubyModelReader
    extends ModelReaderSupport
{
    private static final String MAVEN_TOOLS_POM_GENERATOR_RB = "maven/tools/pom_generator.rb";

    @Requirement( hint = "default" )
    private ModelReader xmlReader;

    private final ScriptingContainer scriptingContainer;

    private final Object pomReader;
    
    private final String method;

    public AbstractRubyModelReader( final String method )
    {
        this.scriptingContainer = new ScriptingContainer( SINGLETON, PERSISTENT );
        final ClassLoader cl = Thread.currentThread().getContextClassLoader();
        this.pomReader =
            this.scriptingContainer.runScriptlet( cl.getResourceAsStream( MAVEN_TOOLS_POM_GENERATOR_RB ),
                                                  MAVEN_TOOLS_POM_GENERATOR_RB );
        this.method = method;
    }

    @SuppressWarnings( "unchecked" )
    public Model read( final Reader input, final Map<String, ?> options )
        throws IOException
    {
        IOUtil.close( input );
        final Model model;

        final File inputFile = new File( options.get( "org.apache.maven.model.building.source" ).toString() );
        // need pom to install artifact with xml-pom !!!
        final File pom = new File( inputFile.getAbsoluteFile() + ".pom" );
        
        List<String> files = (List<String>) FileUtils.loadFile( new File( inputFile.getAbsolutePath() + ".files" ) );
        if ( !inputFile.getAbsolutePath().endsWith( ".gemspec" )) {
            String lockfile = inputFile.getName() + ".lock" ;
            // TODO maybe the lock file must be newer then all files which participated to the pom
            if (new File(lockfile).lastModified() < inputFile.lastModified()) {
                new File(lockfile).delete();
            }
            if ( !files.contains( lockfile ) ){
                files.add( lockfile );
            }
        }
        File mavenFile = new File( inputFile.getParentFile(), "Mavenfile" );
        if ( mavenFile.exists() && !files.contains( mavenFile.getName() )) {
            files.add( mavenFile.getAbsolutePath() );
        }
        if ( !files.contains( inputFile.getName() )) {
            files.add( inputFile.getAbsolutePath() );
        }
        boolean modified = false;
        for( String file: files ){
            File f =  new File( file );
            modified |= !f.exists() || pom.lastModified() < f.lastModified();
        }
        if ( !pom.exists() || modified ) 
        {
            final String pomXml =
                this.scriptingContainer.callMethod( this.pomReader, "read_" + method, inputFile.getAbsolutePath(), String.class );
            // keep the generated pom as temp-file in case there is model error for debugging
            String pomTmp = pom.getAbsolutePath() + ".tmp";
            FileUtils.fileWrite( pomTmp, "utf-8", pomXml );
           
            model = this.xmlReader.read( new StringReader( pomXml ), options );
            FileUtils.rename( new File( pomTmp ), pom );
        }
        else
        {
            model = this.xmlReader.read( new FileReader( pom ), options );
        }
        // not sure if this persists
        model.setPomFile( pom );
        return model;
    }
}
