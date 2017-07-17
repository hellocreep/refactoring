package com.thoughtworks.refactoring.extractInterface

class TimeSheet {
    fun charge(emp: Employee, days: Int): Double {
        val base = emp.getRate() * days
        if (emp.hasSpecialSkill())
            return base * 1.05
        else return base.toDouble()
    }
}