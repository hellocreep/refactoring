package com.thoughtworks.refactoring

/**
 * Created by ztang on 25/05/2017.
 */

class ExtractVariableMethod {
    val _name = "Tom"

    fun checkOS(platform: String, browser: String, resize: Int): Boolean {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("SAFARI") > -1) &&
                wasInitialized() && resize > 0) {
            return true
        }

        return false
    }

    private fun wasInitialized(): Boolean {
        return true
    }

    fun getOwing(): String {
        var Owing: String = ""

        Owing += getBanner()

        Owing = Owing + "name: " + _name
        Owing = Owing + " amount " + getOutstanding()

        return Owing
    }

    private fun getBanner(): String {
        return "This is Banner\n"
    }

    private fun getOutstanding(): String {
        return "Yeah!!"
    }
}