package com.oneeyedmen.dontpanic;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oneeyedmen.xprolo.Domain.Order;
import java.io.IOException;


public class CopOut {


    public String render(Order order) throws IOException {
        return objectMapper.writeValueAsString(order);
    }

    private final ObjectMapper objectMapper = new ObjectMapper();
    {
        objectMapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
    }

}
