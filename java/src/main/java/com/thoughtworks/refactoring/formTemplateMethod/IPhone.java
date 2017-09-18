package com.thoughtworks.refactoring.formTemplateMethod;

public class IPhone extends Phone {
    private static final double ADDITION_RATE = 0.01;

    public IPhone(double base, double tax){
        super(base, tax);
    }

    protected double getTaxAmount() {
        return this.getBase() * (this.getTaxAmount() + ADDITION_RATE);
    }
}
