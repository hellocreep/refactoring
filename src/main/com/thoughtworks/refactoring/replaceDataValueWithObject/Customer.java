package com.thoughtworks.refactoring.replaceDataValueWithObject;

public class Customer {
    private String name;

    public Customer(String naem) {
        this.name = naem;
    }

    public String getName() {
        return name;
    }
}
