package com.thoughtworks.refactoring.module;

/**
 * Created by ztang on 31/03/2017.
 */
public class Order {
    public double getDiscountedPrice(Customer customer) {
        return getGrossPrice() * (1 - customer.getDiscount());
    }

    private double getGrossPrice() {
        return 100.0;
    }
}
