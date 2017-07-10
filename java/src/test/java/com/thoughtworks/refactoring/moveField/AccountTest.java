package com.thoughtworks.refactoring.moveField;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AccountTest {
    @Test
    public void interestForAmountAndDays() throws Exception {
        double interestRate = 1.2;
        AccountType type = new AccountType(interestRate);
        Account account = new Account(type, interestRate);

        double result = account.interestForAmountAndDays(100, 365);

        assertThat(result, is(120.0));
    }
}
