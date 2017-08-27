package com.thoughtworks.refactoring.introduceNullObject

/**
 * Created by syli on 27/08/2017.
 */
data class BillingPlan(val plan: String = "normal") {
    companion object {
        fun basic(): BillingPlan {
            return BillingPlan("basic")
        }
    }
}