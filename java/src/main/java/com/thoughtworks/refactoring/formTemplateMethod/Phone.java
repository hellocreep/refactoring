package com.thoughtworks.refactoring.formTemplateMethod;

public class Phone {
    protected double base = 0;
    protected double tax = 0;

    public Phone(double base, double tax) {
        this.base = base;
        this.tax = tax;
    }
}
