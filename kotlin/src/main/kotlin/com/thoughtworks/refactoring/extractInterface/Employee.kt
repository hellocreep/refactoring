package com.thoughtworks.refactoring.extractInterface

class Employee(private val rate: Int, private val hasSpecialSkill: Boolean) {
    fun getRate(): Int = rate

    fun hasSpecialSkill(): Boolean = hasSpecialSkill
}