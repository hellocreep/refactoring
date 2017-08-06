package com.thoughtworks.refactoring.ReplaceMethodWithMethodObject;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by yzeng on 07/08/2017.
 */
public class UserAccountTest {
    private UserAccount userAccount;

    @Before
    public void setUp() {
        userAccount = new UserAccount();
    }

    @Test
    public void shouldInitUserAccout() {
        assertThat(userAccount, instanceOf(UserAccount.class));
    }

    @Test
    public void gammaFunctionShouldRunCorrectly() {
        int actualOut = userAccount.Gamma(1,2,3);
        assertThat(actualOut, is(697));
    }
}