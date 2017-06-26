package com.thoughtworks.refactoring.pullUpMethod

import java.util.Date

class PreferredCustomer(lastBillDate: Date) : Customer(lastBillDate) {

    fun addPoint(amount: Double) {
        println("add point " + amount * 10)
    }

    override fun chargeFor(lastBillDate: Date, date: Date): Double {
        val day = (date.time - lastBillDate.time) / (24 * 60 * 60 * 1000)

        val amount = day.toDouble() * Customer.BASE_PRICE * 0.8
        addPoint(amount)
        return amount
    }
}
