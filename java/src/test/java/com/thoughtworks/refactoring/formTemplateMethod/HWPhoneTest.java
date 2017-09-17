package com.thoughtworks.refactoring.formTemplateMethod;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HWPhoneTest {
    private HWPhone hwPhone;

    @Before
    public void setUp() {
        hwPhone = new HWPhone(6000, 0.05);
    }

    @Test
    public void shouldGetTotalAmount() {
        assertThat(hwPhone.getTotalAmount(), is(6240.0));
    }
}