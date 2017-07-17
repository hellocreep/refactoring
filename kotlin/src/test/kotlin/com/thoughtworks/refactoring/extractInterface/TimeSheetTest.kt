package com.thoughtworks.refactoring.extractInterface

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.ShouldSpec

class TimeSheetTest : ShouldSpec() {
    init {
        should("calculate rate for consultant in TimeSheet") {
            val consultant = Employee(800, hasSpecialSkill = false)

            TimeSheet().charge(consultant, 20) shouldBe 16000.0
        }

        should("calculate rate for senior consultant in TimeSheet") {
            val senior = Employee(1000, hasSpecialSkill = true)

            TimeSheet().charge(senior, 10) shouldBe 10500.0
        }
    }
}