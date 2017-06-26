package com.thoughtworks.refactoring.inlineClass;

/**
 * Created by yzeng on 18/06/2017.
 */
public class RefactoredPerson {
    private String name;
    private String areaCode;
    private String number;


    public RefactoredPerson(String name, String areaCode, String number) {
        this.name = name;
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWholePhoneNumber() {
        return areaCode + number;
    }
}
