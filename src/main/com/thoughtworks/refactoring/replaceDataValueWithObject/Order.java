package com.thoughtworks.refactoring.replaceDataValueWithObject;

public class Order {
    private Customer customer;


    public Order(String customerName) {
       this.setCustomer(customerName);
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer(customerName);
    }
}
