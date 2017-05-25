package com.thoughtworks.refactoring

/**
 * Created by ztang on 25/05/2017.
 */

class ExtractVariableMethod {
    val _name = "Tom"

    /* Extract Variable
    * You have a complicated expression.
    *
    * Put the result of the expression, or parts of the expression, in a temporary variable with a name that explains the purpose.
    * Compare with Extract Method
    */
    fun checkOS(platform: String, browser: String, resize: Int): Boolean {
        // isMacOs
        // isSafariBrowser
        // wasResized

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

    /*
    You have a code fragment that can be grouped together.

    Turn the fragment into a method whose name explains the purpose of the method.
     */
    fun getOwing(amount: String) {
        printBanner()

        // getDetail
        println("name: " + _name)
        println(" amount " + amount)
    }

    private fun printBanner() {
        println("This is Banner")
    }
}