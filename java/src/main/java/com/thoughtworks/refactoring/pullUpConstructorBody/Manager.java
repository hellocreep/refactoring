package com.thoughtworks.refactoring.pullUpConstructorBody;

public class Manager extends Employee {
    private int _grade;

    Manager(String name, String id, int grade) {
        _name = name;
        _id = id;
        _grade = grade;
    }

    public String description() {
        return "name: " + _name + ", id: " + _id + ", grade: " + _grade;
    }
}
