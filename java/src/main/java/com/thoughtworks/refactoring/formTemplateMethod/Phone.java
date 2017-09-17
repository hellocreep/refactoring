package com.thoughtworks.refactoring.formTemplateMethod;

public class Phone {
    protected double base = 0;
    protected double tax = 0;

    public Phone(double base, double tax) {
        this.base = base;
        this.tax = tax;
    }

    public double getTotalAmount() {
        return getBase() + getTaxAmount();
    }

    protected double getBase() {
        return this.base;
    }

    protected double getTaxAmount() {
        return this.base * this.tax;
    }
}
