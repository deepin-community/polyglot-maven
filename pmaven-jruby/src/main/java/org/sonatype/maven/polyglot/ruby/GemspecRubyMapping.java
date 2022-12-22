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

import java.io.File;

import org.codehaus.plexus.component.annotations.Component;
import org.sonatype.maven.polyglot.mapping.Mapping;
import org.sonatype.maven.polyglot.mapping.MappingSupport;

/**
 * Ruby model mapping.
 * 
 * @author Kristian Meier
 * @since 0.8
 */
@Component( role = Mapping.class, hint = "gemspec-ruby" )
public class GemspecRubyMapping
    extends MappingSupport
{
    public GemspecRubyMapping()
    {
        super( "gemspec-ruby" );
        setAcceptLocationExtensions( ".gemspec" );
        setAcceptOptionKeys( "rb:4.0.0" );
        setPriority( 1.5f );
    }

    @Override
    public File locatePom( final File dir )
    {
        assert dir != null;

        for ( final File f : dir.listFiles() )
        {
            if ( f.isFile() && f.getName().endsWith( ".gemspec" ) )
            {
                return f;
            }
        }
        return null;
    }
}