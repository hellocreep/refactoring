package com.thoughtworks.refactoring.introduceNullObject

/**
 * Created by syli on 27/08/2017.
 */
open class Customer(_customeName: String, _plan: BillingPlan){
    val customeName = _customeName
    val plan = _plan
}