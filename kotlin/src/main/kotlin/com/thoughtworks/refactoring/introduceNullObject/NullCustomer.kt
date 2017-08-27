package com.thoughtworks.refactoring.introduceNullObject

/**
 * Created by syli on 28/08/2017.
 */
class NullCustomer(customeName: String = "occupant", plan: BillingPlan = BillingPlan("basic")) : Customer(customeName, plan) {
    override fun isNull(): Boolean = true
}