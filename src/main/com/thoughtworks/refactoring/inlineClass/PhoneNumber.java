package com.thoughtworks.refactoring.inlineClass;

/**
 * Created by yzeng on 18/06/2017.
 */
public class PhoneNumber {
    private String areaCode;

    private String number;

    public PhoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
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
