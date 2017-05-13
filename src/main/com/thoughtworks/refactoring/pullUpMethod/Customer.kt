package com.thoughtworks.refactoring.pullUpMethod

import java.text.SimpleDateFormat
import java.util.Date

abstract class Customer(var lastBillDate: Date) {

    fun addBill(date: Date, amount: Double): String {
        return DATE_FORMAT.format(date) + " $" + amount
    }

    abstract fun chargeFor(lastBillDate: Date, date: Date): Double

    companion object {
        val DATE_FORMAT = SimpleDateFormat("yyyy-MM-dd")
        val BASE_PRICE = 100.0
    }
}
