package com.thoughtworks.refactoring.inlineClass;

/**
 * Created by yzeng on 18/06/2017.
 */
public class Person {
    private String name;
    private PhoneNumber phoneNumber;

    public Person(String name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
