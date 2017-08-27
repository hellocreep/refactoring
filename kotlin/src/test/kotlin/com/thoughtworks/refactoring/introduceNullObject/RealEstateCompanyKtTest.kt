package com.thoughtworks.refactoring.introduceNullObject

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.StringSpec

/**
 * Created by syli on 27/08/2017.
 */

class RealEstateCompanyKtTest : StringSpec() {
    private val customer = Customer("test user", BillingPlan())
    init{
        "should get customer name and billing plan when site have customer" {
            val site = Site(customer)

            getCustomerName(site) shouldBe "test user"
            getCustomerBillingPlan(site) shouldEqual BillingPlan("normal")
        }

        "should get default customer name and basic billing plan when no customer in site" {
            val site = Site(null)

            getCustomerName(site) shouldBe "occupant"
            getCustomerBillingPlan(site) shouldEqual BillingPlan("basic")
        }
    }
}