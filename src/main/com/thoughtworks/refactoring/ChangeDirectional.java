package com.thoughtworks.refactoring;

import com.thoughtworks.refactoring.module.Customer;
import com.thoughtworks.refactoring.module.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ztang on 31/03/2017.
 */
public class ChangeDirectional {
    void logicCode() {
        List<Order> orders = new ArrayList();
        orders.add(newOrderWithCustomer("Smith"));
        orders.add(newOrderWithCustomer("John"));
        orders.add(newOrderWithCustomer("John"));

        // I want get the order count of John
    }

    private Order newOrderWithCustomer(String name) {
        Order order = new Order();
        order.setCustomer(new Customer(name));
        return order;
    }
}
