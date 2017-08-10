package com.thoughtworks.refactoring.pullUpField;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChequeAccountTest {
    @Test
    public void getMinimumCheckingBalance() throws Exception {
        ChequeAccount account = new ChequeAccount();

        double result = account.getMinimumCheckingBalance();

        assertEquals(result, 6);
    }
}
