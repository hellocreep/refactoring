package com.thoughtworks.refactoring.pullUpField;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckingAccountTest {
    @Test
    public void getMinimumCheckingBalance() throws Exception {
        CheckingAccount account = new CheckingAccount();

        double result = account.getMinimumCheckingBalance();

        assertEquals(result, 5);
    }
}
