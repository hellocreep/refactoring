package com.thoughtworks.refactoring.formTemplateMethod;

public class IPhone extends Phone {
    private static final double ADDITION_RATE = 0.01;

    public IPhone(double base, double tax){
        super(base, tax);
    }

    public double getTotalAmount() {
        return getBase() + getTaxAmount();
    }

    private double getBase() {
        return this.base;
    }

    private double getTaxAmount() {
        return this.base * (this.tax + ADDITION_RATE);
    }
}
