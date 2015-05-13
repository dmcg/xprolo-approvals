package com.oneeyedmen.xprolo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.collect.ImmutableList;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@SuppressWarnings({"UnusedDeclaration", "ConstantConditions"})
public class Domain {

    public static class Customer {
        public Customer(Long id, String firstName, String lastName, Date dob, Address address) {
            //
        }

        public Long id() { return something(); }
        public String getFirstName() { return something(); }
        public String getLastName() { return something(); }
        public int age() { return something(); }
        public Address getAddress() { return something(); }
        public void printOn(PrintStream s) { s.println("Hello"); }
    }

    public static class Address {
        public Address(Long id, String line1, String line2, String postcode) {
            // ...
        }

        public Long id() { return something(); }
        public String getLine1() { return something(); }
        public String getLine2() { return something(); }
        public String getPostcode() { return something(); }
    }

    public static class Order {
        public Order(Long id, Customer customer, Address shippedTo, BigDecimal shippingCost, List<OrderItem> items) {
            // ...
        }

        public Long id() { return something(); }
        public Customer getCustomer() { return something(); }
        public Address getShippedTo() { return something(); }
        public BigDecimal getShippingCost() { return something(); }
        public OrderStatus getStatus() { return something(); }
        public List<OrderItem> getOrderItems() { return something(); }
    }

    public static class OrderItem {
        public OrderItem(Long id, Order order, Product product, BigDecimal quantity, BigDecimal net, BigDecimal gross, String notes) {
            //...
        }
        //...
        public Long id() { return something(); }
        public Product getProduct() { return something(); }
        public Address getShippedTo() { return something(); }
        public BigDecimal getQuantity() { return something(); }
        public BigDecimal getNet() { return something(); }
        public BigDecimal getGross() { return something(); }
        public String getNotes() { return something(); }
    }

    public abstract class Product {
        public Product(Long id, String description, Object ... andSoOnAndSoOn) {}
        public Long id() { return something(); }
        public String getShortText() { return something(); }
    }

    public enum OrderStatus {
        PLACED, PICKED, DISPATCHED, RECEIVED, RETURNED
    }

    private static <T> T something() {
        return null;
    }

}
