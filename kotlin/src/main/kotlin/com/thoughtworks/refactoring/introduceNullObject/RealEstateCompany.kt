package com.thoughtworks.refactoring.introduceNullObject

/**
 * Created by syli on 27/08/2017.
 */

fun getCustomerName(site: Site): String {
    val customer = site.customer

    return if (customer.isNull()) "occupant" else customer.customeName
}

fun getCustomerBillingPlan(site: Site): BillingPlan {
    val customer = site.customer

    return if (customer.isNull()) BillingPlan.basic() else customer.plan
}