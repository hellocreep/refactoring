package com.thoughtworks.refactoring.module;

import static org.junit.Assert.*;

/**
 * Created by ztang on 31/03/2017.
 */
public class OrderTest {
    @org.junit.Test
    public void getOrderOwnerName() throws Exception {
        Order order = new Order();
        order.setCustomer(new Customer("John"));

        assertEquals(order.getOrderOwnerName(), "John");
    }

}