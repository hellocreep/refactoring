package com.thoughtworks.refactoring.moveField;

public class AccountType {
    //use lots of interestRate in methods
    //...


    public AccountType(double interestRate) {
        this.interestRate = interestRate;
    }

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
