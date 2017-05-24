package com.thoughtworks.refactoring

/**
 * Created by ztang on 25/05/2017.
 */

class ExtractVariableMethod {
    fun checkOS(platform: String, browser: String, resize: Int): Boolean {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("Safari") > -1) &&
                wasInitialized() && resize > 0) {
            return true
        }

        return false
    }

    private fun wasInitialized(): Boolean {
        return true
    }
}