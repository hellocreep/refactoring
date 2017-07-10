package com.thoughtworks.refactoring.moveField;

public class Account {
    private AccountType type;
    private double interestRate;

    public Account(AccountType type, double interestRate) {
        this.interestRate = interestRate;
        this.type = type;
    }

    double interestForAmountAndDays(double amount, int days) {
        return interestRate * amount * days / 365;
    }
}
