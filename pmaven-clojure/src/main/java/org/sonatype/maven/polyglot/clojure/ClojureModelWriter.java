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

import clojure.lang.Namespace;
import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.ModelWriter;
import org.codehaus.plexus.component.annotations.Component;
import org.sonatype.maven.polyglot.io.ModelWriterSupport;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

/**
 * Writes a Maven {@link org.apache.maven.model.Model} to a <tt>pom.clj</tt>.
 *
 * @author <a href="mailto:mark@derricutt.com">Mark Derricutt</a>
 * @author <a href="mailto:antony.blakey@linkuistics.com">Antony Blakey</a>
 *
 * @since 0.7
 */
@Component(role = ModelWriter.class, hint = "clojure")
public class ClojureModelWriter extends ModelWriterSupport {

    public void write(Writer writer, Map<String, Object> stringObjectMap, Model model) throws IOException {
        try {
            final Var REQUIRE = Var.intern(RT.CLOJURE_NS, Symbol.create("require"));
            final Symbol REFLECTOR = Symbol.create("org.sonatype.maven.polyglot.clojure.dsl.writer");
            REQUIRE.invoke(REFLECTOR);
            final Var WRITER = Var.intern(Namespace.findOrCreate(REFLECTOR), Symbol.create("write-model"));
            WRITER.invoke(model, writer);
        } catch (Exception e) {
            e.printStackTrace();
            // Don't use new IOException(e) because it doesn't exist in Java 5
            throw (IOException) new IOException(e.toString()).initCause(e);
        }
    }
    
}
