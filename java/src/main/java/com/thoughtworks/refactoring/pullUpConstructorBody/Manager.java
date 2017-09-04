package com.thoughtworks.refactoring.pullUpConstructorBody;

public class Manager extends Employee {
    private int _grade;

   protected Manager(String name, String id, int grade) {
        super(name, id);
        _grade = grade;
    }

    public String description() {
        return "name: " + _name + ", id: " + _id + ", grade: " + _grade;
    }
}
