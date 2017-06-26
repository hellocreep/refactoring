package com.thoughtworks.refactoring.inlineClass;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by yzeng on 18/06/2017.
 */
public class PhoneNumberTest {
    private PhoneNumber phoneNumber;

    @Before
    public void setUp() {
        phoneNumber = new PhoneNumber("123", "456789");
    }

    @Test
    public void shouldCreatePhoneNumberWithAreaCodeAndNumber() {
        assertThat(phoneNumber.getAreaCode(), is("123"));
        assertThat(phoneNumber.getNumber(), is("456789"));
    }

    @Test
    public void shouldGetWholeTelephoneNumber() {
        assertThat(phoneNumber.getWholePhoneNumber(), is("123456789"));
    }
}