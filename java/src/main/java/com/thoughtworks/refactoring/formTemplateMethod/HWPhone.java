package com.thoughtworks.refactoring.formTemplateMethod;

public class HWPhone extends Phone{
    private static final double DISCOUNT_RATE = 0.01;

    public HWPhone(double base, double tax){
        super(base, tax);
    }

    public double getTotalAmount() {
        return getBase() + getTaxAmount();
    }

    private double getBase() {
        return this.base;
    }

    private double getTaxAmount() {
        return this.base * (this.tax - DISCOUNT_RATE);
    }
}
