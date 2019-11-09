package com.sookiwi.kotlinplayground.leet359

class Logger {
    private val printed: MutableMap<String, Int> = mutableMapOf()

    fun shouldPrintMessage(timestamp: Int, message: String): Boolean {
        return if (printed[message]?.let { timestamp >= it + 10 } != false) {
            printed[message] = timestamp
            true
        } else {
            false
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * var obj = Logger()
 * var param_1 = obj.shouldPrintMessage(timestamp,message)
 */
