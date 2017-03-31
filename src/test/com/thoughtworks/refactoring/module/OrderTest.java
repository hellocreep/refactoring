package com.thoughtworks.refactoring.module;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Created by ztang on 31/03/2017.
 */
public class OrderTest {

    private Order order;
    private Customer john;

    @Before
    public void setUp() {
        order = new Order();
        john = new Customer("John");
    }

    @Test
    public void shouldGetCorrectDiscountedPrice() throws Exception {
        closeTo(order.getDiscountedPrice(john), 90.0);
    }
}