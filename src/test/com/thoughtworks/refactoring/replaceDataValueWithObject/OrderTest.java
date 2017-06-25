package com.thoughtworks.refactoring.replaceDataValueWithObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    @Test
    public void getOrderOwnerName() throws Exception {
        Order order = new Order("LU");

        String customerName = order.getCustomerName();
        assertEquals(customerName, "LU");
    }
}
