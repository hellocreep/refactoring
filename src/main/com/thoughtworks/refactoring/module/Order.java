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
        if (this.customer != null) {
            this.customer.friendOrders().remove(this);
        }
        this.customer = customer;
        if (this.customer != null) {
            this.customer.friendOrders().add(this);
        }
    }

    public String getOrderOwnerName() {
        return this.customer.getName();
    }

    public double getDiscountedPrice() {
        return getGrossPrice() * (1 - customer.getDiscount());
    }

    private double getGrossPrice() {
        return 100.0;
    }
}
