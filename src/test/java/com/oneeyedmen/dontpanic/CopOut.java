package com.oneeyedmen.dontpanic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.oneeyedmen.fakir.Faker;
import com.oneeyedmen.xprolo.Domain.Order;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CopOut {


//    @Test
//    public void test() throws IOException {
//        String actual = renderer.render(Faker.fakeA(Order.class));
//        Files.write(actual, new File("actual.json"), Charsets.UTF_8);
//        String approved = Files.toString(new File("approved.json"), Charsets.UTF_8);
//        assertEquals(approved, actual);
//    }

//    public String render(Order order) throws IOException {
//        return objectMapper.writeValueAsString(order);
//    }
}
