package com.thoughtworks.refactoring.module;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by ztang on 05/04/2017.
 */
public class CustomerTest {
    @Test
    public void shouldReturnZeroForDisabilityAmountWhenIsPartTimeIsTrue() throws Exception {
        Customer john = new Customer("john");
        john.setPartTime(true);

        assertThat(john.disabilityAmount(), is(0.0));
    }

    @Test
    public void shouldReturnZeroForDisabilityAmountWhenSeniorityLessThenTwo() throws Exception {
        Customer john = new Customer("john");
        john.seniority = 1;

        assertThat(john.disabilityAmount(), is(0.0));
    }

    @Test
    public void shouldReturnZeroForDisabilityAmountWhenMonthDisabledGreaterThenTwelve() throws Exception {
        Customer john = new Customer("john");
        john.monthDisabled = 13;

        assertThat(john.disabilityAmount(), is(0.0));
    }

    @Test
    public void shouldReturnCorrectAmount() throws Exception {
        Customer john = new Customer("john");

        assertThat(john.disabilityAmount(), is(1.1));
    }
}