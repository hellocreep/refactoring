package com.thoughtworks.refactoring.introduceNullObject

/**
 * Created by syli on 27/08/2017.
 */

fun getCustomerName(site: Site): String {

    return site.customer.customeName
}

fun getCustomerBillingPlan(site: Site): BillingPlan {

    return site.customer.plan
}