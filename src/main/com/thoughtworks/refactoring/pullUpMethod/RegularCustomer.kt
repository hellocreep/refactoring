package com.thoughtworks.refactoring.pullUpMethod

import java.util.Date

class RegularCustomer(lastBillDate: Date) : Customer(lastBillDate) {

    fun createBill(date: Date): String {
        val chargeAmount = chargeFor(lastBillDate, date)
        return addBill(date, chargeAmount)
    }

    fun chargeFor(lastBillDate: Date, date: Date): Double {
        val day = (date.time - lastBillDate.time) / (24 * 60 * 60 * 1000)

        return day * Customer.BASE_PRICE
    }
}
