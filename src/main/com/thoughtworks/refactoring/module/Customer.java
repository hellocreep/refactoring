package com.thoughtworks.refactoring.module;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ztang on 31/03/2017.
 */
public class Customer {
    private String name;
    private Set<Order> orders;
    public int seniority = 3;
    public int monthDisabled = 0;
    public boolean isPartTime = false;

    public Customer(String name) {
        this.name = name;
        this.orders = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Order> friendOrders() {
        return orders;
    }

    public double getDiscount() {
        return 0.1;
    }

    // Consolidate Conditional Expression
    /*
    * 1. Check that none of the conditionals has side effects.
    * If there are side effects, you won't be able to do this refactoring.
    * 2. Replace the string of conditionals with a single conditional statement using logical operators.
    * 3. Compile and test.
    * 4. Consider using Extract Method on the condition.
    * */
    public double disabilityAmount() {
        if (this.seniority < 2) return 0.0;
        if (this.monthDisabled > 12) return 0.0;
        if (this.isPartTime) return 0.0;

        // if return value is same, we can use Ors.
        if (this.seniority < 2 || this.monthDisabled > 12 || this.isPartTime) return 0;
        if (isNotEligibleForDisability()) return 0;

        // if have nested if, we can use Ands.
        if (this.seniority < 2) {
            if (this.monthDisabled > 12) {
                return 0.1;
            }
        }

        if (this.seniority < 2 && this.monthDisabled > 12) return 0.1;

        // compute the disability amount
        return 1.1;
    }

    private boolean isNotEligibleForDisability() {
        return this.seniority < 2 || this.monthDisabled > 12 || this.isPartTime;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public void setPartTime(boolean partTime) {
        isPartTime = partTime;
    }
}
