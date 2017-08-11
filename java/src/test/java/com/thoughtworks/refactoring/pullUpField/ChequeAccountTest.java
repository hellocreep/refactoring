package com.thoughtworks.refactoring.pullUpField;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ChequeAccountTest {
    @Test
    public void getMinimumCheckingBalance() throws Exception {
        ChequeAccount account = new ChequeAccount();

        int result = account.getMinimumCheckingBalance();

        assertThat(result, is(6));
    }
}
