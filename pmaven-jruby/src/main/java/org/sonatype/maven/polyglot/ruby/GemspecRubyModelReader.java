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

import org.apache.maven.model.io.ModelReader;
import org.codehaus.plexus.component.annotations.Component;

/**
 * Ruby model reader.
 * 
 * @author mkristian
 * @since 0.8
 */
@Component( role = ModelReader.class, hint = "gemspec-ruby" )
public class GemspecRubyModelReader
    extends AbstractRubyModelReader
{

    public GemspecRubyModelReader()
    {
        super( "gemspec" );
    }

}
