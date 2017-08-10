package com.thoughtworks.refactoring.pullUpField;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingAccountTest {
    @Test
    public void getMinimumCheckingBalance() throws Exception {
        SavingAccount account = new SavingAccount();

        double result = account.getMinimumCheckingBalance();

        assertEquals(result, 5);
    }
}
