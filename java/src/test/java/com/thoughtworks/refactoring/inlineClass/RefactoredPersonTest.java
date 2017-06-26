package com.thoughtworks.refactoring.inlineClass;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by yzeng on 18/06/2017.
 */
public class RefactoredPersonTest {
    private RefactoredPerson person;

    @Before
    public void setUp() {
        person = new RefactoredPerson("YZeng", "123", "456789");
    }

    @Test
    public void shouldCreatePersonWithNameAndPhoneNumber() {
        assertThat(person.getName(), is("YZeng"));
        assertThat(person.getAreaCode(), is("123"));
        assertThat(person.getNumber(), is("456789"));
    }

    @Test
    public void shouldGetWholeTelephoneNumber() {
        assertThat(person.getWholePhoneNumber(), is("123456789"));
    }
}