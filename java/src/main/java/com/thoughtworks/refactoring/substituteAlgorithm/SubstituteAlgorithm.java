package com.thoughtworks.refactoring.substituteAlgorithm;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ztang on 05/07/2017.
 * Why Refactor
 * 1. An algorithm that is much simpler and more efficient
 * 2. Your algorithm may be incorporated into a well-known library or framework and you want to get rid of your
 * independent implementation.
 * 3. The requirements for your program may change so heavily that your existing algorithm cannot be salvaged
 * for the task.
 * <p>
 * How
 * 1. Make sure that you have simplified the existing algorithm as much as possible. (Extract Method)
 * 2. Create your new algorithm in a new method. Replace the old algorithm with the new one and start testing
 * the program.
 * 3. If the results do not match, return to the old implementation and compare the results. Identify the
 * causes of the discrepancy. While the cause is often an error in the old algorithm, it is more likely due
 * to something not working in the new one.
 * 4. When all tests are successfully completed, delete the old algorithm for good!
 */
public class SubstituteAlgorithm {
    String foundPerson(String[] peoples) {
        List candidates = Arrays.asList("Don", "John", "Kent");
        for (String people : peoples) {
            if (candidates.contains(people)) {
                return people;
            }
        }
        return "";
    }
}
