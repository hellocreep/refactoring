package com.thoughtworks.refactoring.module;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ztang on 31/03/2017.
 */
public class OrderTest {
    @Test
    public void getOrderOwnerName() throws Exception {
        Order order = new Order();
        order.setCustomer(new Customer("John"));

        assertEquals(order.getOrderOwnerName(), "John");
    }

}