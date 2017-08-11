package com.thoughtworks.refactoring.pullUpField;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckingAccountTest {
    @Test
    public void getMinimumCheckingBalance() throws Exception {
        CheckingAccount account = new CheckingAccount();

        int result = account.getMinimumCheckingBalance();

        assertThat(result, is(5));
    }
}
