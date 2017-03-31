package com.thoughtworks.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ztang on 01/04/2017.
 */
public class ChangeDirectionalTest {
    @Test
    public void getOrderOwnerName() throws Exception {
        ChangeDirectional changeDirectional = new ChangeDirectional();

        int count = changeDirectional.countOrderByCustomerName("John");
        assertEquals(count, 2);
    }
}