package com.thoughtworks.refactoring.module;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertEquals;

/**
 * Created by ztang on 31/03/2017.
 */
public class OrderTest {

    private Order order;

    @Before
    public void setUp() {
        order = new Order();
        order.setCustomer(new Customer("John"));
    }

    @Test
    public void getOrderOwnerName() throws Exception {
        assertEquals(order.getOrderOwnerName(), "John");
    }

    @Test
    public void shouldGetCorrectDiscountedPrice() throws Exception {
        closeTo(order.getDiscountedPrice(), 90.0);
    }
}