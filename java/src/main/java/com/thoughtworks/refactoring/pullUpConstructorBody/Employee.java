package com.thoughtworks.refactoring.pullUpConstructorBody;

public class Employee {
    protected String _name = "employee";
    protected String _id = "a";

    protected Employee(String name, String id) {
        _name = name;
        _id = id;
    }

    public String description() {
        return "name: " + _name + ", id: " + _id;
    }
 }
