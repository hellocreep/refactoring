package com.thoughtworks.refactoring.replaceDataValueWithObject;

public class Order {
    public Customer customer;


    public Order(String customerName) {
        this.customer = new Customer(customerName);
    }

    public String getCustomerName() {
        return this.customer.getName();
    }
}
