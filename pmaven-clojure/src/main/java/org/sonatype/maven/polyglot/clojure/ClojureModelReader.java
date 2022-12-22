/*
 * Copyright (C) 2010 the original author or authors.
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
package org.sonatype.maven.polyglot.clojure;

import clojure.lang.Atom;
import clojure.lang.Namespace;
import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.ModelReader;
import org.codehaus.plexus.component.annotations.Component;
import org.sonatype.maven.polyglot.PolyglotModelUtil;
import org.sonatype.maven.polyglot.io.ModelReaderSupport;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

/**
 * Reads a <tt>pom.clj</tt> and transforms into a Maven {@link Model}.
 *
 * @author <a href="mailto:mark@derricutt.com">Mark Derricutt</a>
 * @author <a href="mailto:antony.blakey@linkuistics.com">Antony Blakey</a>

 * @since 0.7
 */
@Component(role = ModelReader.class, hint = "clojure")
public class ClojureModelReader extends ModelReaderSupport {

    //@Requirement
    //protected Logger log;

    //@Requirement
    //private ModelBuilder builder;

    //@Requirement
    //private ExecuteManager executeManager;

    public Model read(final Reader input, final Map<String, ?> options) throws IOException {
        assert input != null;

        try {
            String location = PolyglotModelUtil.getLocation(options);

            final Var USE = Var.intern(RT.CLOJURE_NS, Symbol.create("use"));
            final Symbol READER = Symbol.create("org.sonatype.maven.polyglot.clojure.dsl.reader");
            final Symbol LEININGEN = Symbol.create("org.sonatype.maven.polyglot.clojure.dsl.leiningen");
            USE.invoke(READER);
            USE.invoke(LEININGEN);
            clojure.lang.Compiler.load(input, location, location);
            final Var MODEL = Var.intern(Namespace.findOrCreate(READER), Symbol.create("*MODEL*"));
            return  (Model) ((Atom) MODEL.get()).deref();
        }
        catch (Exception e) {
            // Don't use new IOException(e) because it doesn't exist in Java 5
            throw (IOException) new IOException(e.toString()).initCause(e);
        }
    }
}
