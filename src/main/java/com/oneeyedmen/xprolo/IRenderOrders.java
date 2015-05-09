package com.oneeyedmen.xprolo;

import java.io.IOException;

import static com.oneeyedmen.xprolo.Domain.Order;

public interface IRenderOrders {

    public String render(Order order) throws IOException;

}
