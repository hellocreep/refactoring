package com.thoughtworks.refactoring.pullUpField;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SavingAccountTest {
    @Test
    public void getMinimumCheckingBalance() throws Exception {
        SavingAccount account = new SavingAccount();

        int result = account.getMinimumCheckingBalance();

        assertThat(result, is(5));
    }
}
