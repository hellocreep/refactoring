package com.thoughtworks.refactoring.moveField;

public class Account {
    private AccountType type;

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Account(AccountType type, double interestRate) {
        this.interestRate = interestRate;
        this.type = type;
    }

    double interestForAmountAndDays(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }
}
