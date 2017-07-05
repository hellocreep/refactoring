package com.thoughtworks.refactoring.substituteAlgorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ztang on 05/07/2017.
 */
public class SubstituteAlgorithmTest {
    @Test
    public void foundDonFromPeopleList() throws Exception {
        String[] peoples = {"Jam", "Don"};
        String person = new SubstituteAlgorithm().newFoundPerson(peoples);

        assertEquals("Can't found the correct person", "Don", person);
    }

    @Test
    public void foundKentFromPeopleList() throws Exception {
        String[] peoples = {"Kent", "Don"};
        String person = new SubstituteAlgorithm().newFoundPerson(peoples);

        assertEquals("Can't found the correct person", "Kent", person);
    }
}