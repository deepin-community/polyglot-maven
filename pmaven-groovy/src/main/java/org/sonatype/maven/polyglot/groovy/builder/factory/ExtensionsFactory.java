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
import org.apache.maven.model.Exclusion;
import org.apache.maven.model.Extension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Builds extensions nodes.
 *
 * @author <a href="mailto:tobrien@discursive.com">Tim O'Brien</a>
 *
 * @since 0.8
 */
public class ExtensionsFactory
    extends ListFactory
{
    public ExtensionsFactory() {
        super("extensions");
    }

    @Override
    public Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attrs) throws InstantiationException, IllegalAccessException {
        Object node;

        if (value != null) {
            node = parse(value);

            if (node == null) {
                throw new NodeValueParseException(this, value);
            }
        }
        else {
            node = new ArrayList();
        }

        return node;
    }

    public static Object parse(final Object value) {
        assert value != null;

        // This first clause is a kludge.  Maybe there is a better way
        // but we're overloading "extensions" in POMs.
        if (value instanceof String && isBoolean( (String) value ) ) {
        	return value;
        } else if( value instanceof String) {
            Extension child = ExtensionFactory.parse(value);
            if (child != null) {
                List node = new ArrayList();
                node.add(child);
                return node;
            }
        }
        else if (value instanceof List) {
            List node = new ArrayList();
            for (Object item : (List)value) {
                Extension child = ExtensionFactory.parse(item);
                if (child == null) {
                    return null;
                }
                node.add(child);
            }
            return node;
        }

        return null;
    }

    //  TOB: Sure, some clever bastard is going to come along and tell me there 
    //  is a simpler way to do this.  Please, if you have a better solution fix this.
	private static boolean isBoolean(String value) {
		return value.equalsIgnoreCase( "true" ) || value.equalsIgnoreCase("false");
	}
}