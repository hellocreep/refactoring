package com.thoughtworks.refactoring.module;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ztang on 31/03/2017.
 */
public class Customer {
    private String name;
    private Set<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Order> friendOrders() {
        return orders;
    }

    public double getDiscount() {
        return 0.1;
    }
}
