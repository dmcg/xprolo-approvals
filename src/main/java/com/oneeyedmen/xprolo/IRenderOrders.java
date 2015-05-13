package com.oneeyedmen.xprolo;

import java.io.IOException;
import java.io.OutputStream;

import static com.oneeyedmen.xprolo.Domain.Order;

public interface IRenderOrders {

    public void render(OutputStream os, Order order) throws IOException;

}
