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

        // 1. Add a field for the back pointer.
        // 2. Decide which class will control the association.
        // 3. Create a helper method on the noncontrolling side of the association.
        //    Name this method to clearly indicate its restricted use.
        // 4. If the existing modifier is on the controlling side, modify it to update the back points.
        // 5. If the existing modifier is on the controlled side, create a controlling
        //    method on the controlling side to call it from the existing modifier.
    }

    private Order newOrderWithCustomer(String name) {
        Order order = new Order();
        order.setCustomer(new Customer(name));
        return order;
    }
}
