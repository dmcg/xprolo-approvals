package com.oneeyedmen.xprolo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oneeyedmen.fakir.DefaultFactory;
import com.oneeyedmen.fakir.Factory;
import com.oneeyedmen.fakir.Faker;
import com.oneeyedmen.xprolo.Domain.Order;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class JsonOrderRendererTest {

    IRenderOrders renderer = new JsonOrderRenderer();

    @Test
    public void test() throws IOException {
        OutputStream os = new ByteArrayOutputStream();
        renderer.render(os, Faker.fakeA(Order.class, legacyFactory()));
        assertEquals(approved(Paths.get("JsonOrderRendererTest.json")), os.toString());
    }

    private Factory legacyFactory() {
        return new DefaultFactory().withOverrideObject(Domain.OrderItem.class, new Object() {String orderNotes = "notes";});
    }

    private String approved(Path path) throws IOException {
        if (path.toFile().isFile())
            return Util.readFileToString(path);
        path.toFile().createNewFile();
        return "";
    }

    public static class JsonOrderRenderer implements IRenderOrders {
        @Override
        public void render(OutputStream os, Order order) throws IOException {
            new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(os, order);
        }
    }
}
