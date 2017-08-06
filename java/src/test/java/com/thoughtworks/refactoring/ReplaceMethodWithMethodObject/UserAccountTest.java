package com.thoughtworks.refactoring.ReplaceMethodWithMethodObject;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
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
}