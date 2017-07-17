package com.thoughtworks.refactoring.extractInterface

interface Billable {
    fun getRate(): Int
    fun hasSpecialSkill(): Boolean
}