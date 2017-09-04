package com.thoughtworks.refactoring.pullUpConstructorBody;

public class Employee {
    protected String _name = "employee";
    protected String _id = "a";

    public String description() {
        return "name: " + _name + ", id: " + _id;
    }
 }
