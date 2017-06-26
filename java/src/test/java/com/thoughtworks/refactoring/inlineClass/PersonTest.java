package com.thoughtworks.refactoring.inlineClass;

import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by yzeng on 18/06/2017.
 */
public class PersonTest {
    @Mock
    private PhoneNumber phoneNumber;

    private Person person;

    @Test
    public void shouldCreatePersonWithNameAndPhoneNumber() {
       person = new Person("YZeng", phoneNumber);

        assertThat(person.getName(), is("YZeng"));
        assertThat(person.getPhoneNumber(), is(phoneNumber));
    }
}