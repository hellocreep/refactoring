package com.thoughtworks.refactoring;

import com.thoughtworks.refactoring.module.Customer;
import com.thoughtworks.refactoring.module.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ztang on 31/03/2017.
 */
public class ChangeDirectional {
    private List<Order> orders;
    private List<Customer> customers;

    public ChangeDirectional() {
        orders = new ArrayList<>();
        customers = new ArrayList<>();
        Order orderOne = new Order();
        Order orderTwo = new Order();
        Order orderThree = new Order();
        Customer smith = new Customer("Smith");
        Customer john = new Customer("John");

        customers.add(smith);
        customers.add(john);

        smith.friendOrders().add(orderOne);
        john.friendOrders().add(orderTwo);
        john.friendOrders().add(orderThree);
    }

    // I want get the order count of John

    // 1. Add a field for the back pointer.
    // 2. Decide which class will control the association.
    // 3. Create a helper method on the noncontrolling side of the association.
    //    Name this method to clearly indicate its restricted use.
    // 4. If the existing modifier is on the controlling side, modify it to update the back points.
    // 5. If the existing modifier is on the controlled side, create a controlling
    //    method on the controlling side to call it from the existing modifier.

    public int countOrderByCustomerName(String name) {
        return customers.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst()
                .get()
                .friendOrders().size();
    }
}
