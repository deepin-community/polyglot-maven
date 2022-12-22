package org.sonatype.maven.polyglot.clojure;

import org.apache.maven.model.Model;
import org.apache.maven.model.building.ModelProcessor;
import org.apache.maven.model.io.ModelReader;
import org.codehaus.plexus.PlexusTestCase;
import org.junit.Test;

import java.io.StringWriter;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Tests for {@link ClojureModelWriter}.
 *
 * @author <a href="mailto:mark@derricutt.com">Mark Derricutt</a>
 */
public class ClojureModelWriterTest
    extends PlexusTestCase
{
    @Test
    public void testModelPrinting() throws Exception {
        Model model = readClojureModel("test1.clj");
        assertNotNull(model);

        ClojureModelWriter writer = new ClojureModelWriter();

        StringWriter sw = new StringWriter();

        writer.write(sw, new HashMap(), model);

        System.out.println(sw.getBuffer().toString());
    }

    private Model readClojureModel(final String sourceFile) throws Exception {
        ModelReader reader = lookup(ModelReader.class, "clojure");

        URL input = getClass().getResource(sourceFile);
        assertNotNull(input);

        Map<String,Object> options = new HashMap<String,Object>();
        options.put(ModelProcessor.SOURCE, input);
        return reader.read(input.openStream(), options);
    }
}
