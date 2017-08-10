package com.thoughtworks.refactoring.pullUpField;

public class CheckingAccount extends Account {

    public int getMinimumCheckingBalance() {
        return _minimumCheckingBalance;
    }
}
