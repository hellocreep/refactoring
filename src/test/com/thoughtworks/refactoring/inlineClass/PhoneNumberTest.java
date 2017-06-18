package com.thoughtworks.refactoring.inlineClass;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by yzeng on 18/06/2017.
 */
public class PhoneNumberTest {
    private PhoneNumber phoneNumber;
    @Test
    public void shouldCreatePhoneNumberWithAreaCodeAndNumber() {
        phoneNumber = new PhoneNumber("123", "456789");

        assertThat(phoneNumber.getAreaCode(), is("123"));
        assertThat(phoneNumber.getNumber(), is("456789"));
    }

    @Test
    public void shouldGetWholeTelephoneNumber() {
        phoneNumber = new PhoneNumber("123", "456789");

        assertThat(phoneNumber.getWholePhoneNumber(), is("123456789"));
    }
}