package com.thoughtworks.refactoring.pullUpField;

public class ChequeAccount extends Account {
    private int _minimumCheckingBalance = 6;

    public int getMinimumCheckingBalance() {
        return _minimumCheckingBalance;
    }
}
