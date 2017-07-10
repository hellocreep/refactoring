package com.thoughtworks.refactoring.moveField;

public class Account {
    private AccountType type;

    public double getInterestRate() {
        return type.getInterestRate();
    }

    public void setInterestRate(double interestRate) {
        this.type.setInterestRate(interestRate);
    }

    public Account(AccountType type) {
        this.type = type;
    }

    double interestForAmountAndDays(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }
}
