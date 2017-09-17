package com.thoughtworks.refactoring.formTemplateMethod;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

public class PhoneTest {
    private Phone phone;
    @Before
    public void setUp() {
        phone = new Phone(100, 0.1);
    }

    @Test
    public void shouldCreatePhone() {
        assertThat(phone, instanceOf(Phone.class));
    }
}