package com.thoughtworks.refactoring.formTemplateMethod;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class IPhoneTest {
    private IPhone iPhone;

    @Before
    public void setUp() {
        iPhone = new IPhone(6000, 0.05);
    }

    @Test
    public void shouldGetTotalAmount() {
        assertThat(iPhone.getTotalAmount(), is(6360.0));
    }
}