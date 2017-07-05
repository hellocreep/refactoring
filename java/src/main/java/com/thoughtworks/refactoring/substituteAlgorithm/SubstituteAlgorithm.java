package com.thoughtworks.refactoring.substituteAlgorithm;

/**
 * Created by ztang on 05/07/2017.
 */
public class SubstituteAlgorithm {
    String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
            if (people[i].equals("Kent")) {
                return "Kent";
            }
        }
        return "";
    }
}
