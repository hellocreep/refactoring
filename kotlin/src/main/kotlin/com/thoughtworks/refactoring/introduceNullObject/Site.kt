package com.thoughtworks.refactoring.introduceNullObject

/**
 * Created by syli on 27/08/2017.
 */
class Site(private val _customer: Customer?) {
    val customer
        get() = _customer ?: NullCustomer()

    constructor() : this(null)
}