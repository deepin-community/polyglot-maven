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

package org.sonatype.maven.polyglot.groovy.builder.factory;

import groovy.util.FactoryBuilderSupport;

import java.util.Map;

import org.apache.maven.model.Extension;

/**
 * Builds {@link org.apache.maven.model.Extension nodes.
 *
 * @author <a href="mailto:tobrien@discursive.com">Tim O'Brien</a>
 *
 * @since 0.8
 */
public class ExtensionFactory
    extends NamedFactory
{
    public ExtensionFactory() {
        super("extension");
    }

    public Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attrs) throws InstantiationException, IllegalAccessException {
        Extension node;

        if (value != null) {
            node = parse(value);
            if (node == null) {
                throw new NodeValueParseException(this, value);
            }
        }
        else {
            node = new Extension();
        }

        return node;
    }

    public static Extension parse(final Object value) {
        assert value != null;

        if (value instanceof String) {
            Extension node = new Extension();
            String[] items = ((String)value).split(":");
            switch (items.length) {
                case 2:
                    node.setGroupId(items[0]);
                    node.setArtifactId(items[1]);
                    return node;
                case 3:
                    node.setGroupId(items[0]);
                    node.setArtifactId(items[1]);
                    node.setVersion(items[2]);
                    return node;
            }
        }

        return null;
    }
}