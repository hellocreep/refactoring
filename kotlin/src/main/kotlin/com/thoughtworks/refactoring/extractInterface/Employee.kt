package com.thoughtworks.refactoring.extractInterface

class Employee(private val rate: Int, private val hasSpecialSkill: Boolean): Billable {
    override fun getRate(): Int = rate

    override fun hasSpecialSkill(): Boolean = hasSpecialSkill
}