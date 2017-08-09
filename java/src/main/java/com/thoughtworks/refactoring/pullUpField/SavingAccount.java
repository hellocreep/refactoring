package com.thoughtworks.refactoring.pullUpField;

public class SavingAccount extends Account {

    public int getMinimumCheckingBalance() {
        return _minimumCheckingBalance;
    }
}