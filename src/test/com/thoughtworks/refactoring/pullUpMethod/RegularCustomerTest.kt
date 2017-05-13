package com.thoughtworks.refactoring.pullUpMethod

import org.junit.Before
import org.junit.Test

import org.hamcrest.Matchers.`is`
import org.junit.Assert.*

class RegularCustomerTest {
    private var testCustomer: RegularCustomer? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        testCustomer = RegularCustomer(Customer.DATE_FORMAT.parse("2016-12-31"))
    }

    @Test
    @Throws(Exception::class)
    fun shouldPrint200WhenStayFor2Days() {
        val bill = testCustomer!!.createBill(Customer.DATE_FORMAT.parse("2017-01-02"))

        assertThat(bill, `is`("2017-01-02 $200.0"))
    }
}