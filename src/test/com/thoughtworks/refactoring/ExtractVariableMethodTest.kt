package com.thoughtworks.refactoring

import org.hamcrest.Matchers
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Created by ztang on 25/05/2017.
 */
class ExtractVariableMethodTest {
    private var extractVariableMethod: ExtractVariableMethod? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        extractVariableMethod = ExtractVariableMethod()
    }

    @Test
    fun checkOS() {
        assertThat(extractVariableMethod!!.checkOS("Mac OS", "Safari 10", 1024), Matchers.`is`(true))
        assertThat(extractVariableMethod!!.checkOS("Mac OS", "Safari 10", 0), Matchers.`is`(false))
        assertThat(extractVariableMethod!!.checkOS("Ubuntu", "Chrome 54", 1024), Matchers.`is`(false))
    }
}