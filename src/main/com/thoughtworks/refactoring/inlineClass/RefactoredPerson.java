package com.thoughtworks.refactoring.inlineClass;

/**
 * Created by yzeng on 18/06/2017.
 */
public class RefactoredPerson {
    private String name;
    private PhoneNumber phoneNumber;


    public RefactoredPerson(String name, PhoneNumber phoneNumber) {
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

    public String getAreaCode() {
        return phoneNumber.getAreaCode();
    }

    public void setAreaCode(String areaCode) {
        this.phoneNumber.setAreaCode(areaCode);
    }

    public String getNumber() {
        return phoneNumber.getNumber();
    }

    public void setNumber(String number) {
        this.phoneNumber.setNumber(number);
    }
}
