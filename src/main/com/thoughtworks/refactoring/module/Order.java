package com.thoughtworks.refactoring.module;

/**
 * Created by ztang on 31/03/2017.
 */
public class Order {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderOwnerName() {
        return this.customer.getName();
    }
}
