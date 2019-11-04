package com.sookiwi.kotlinplayground.leet125

class Solution {
    fun isPalindrome(s: String): Boolean {
        val normalizedS = s.toLowerCase().replace(Regex("[^A-Za-z0-9]"), "")
        var isPal = true
        normalizedS.forEachIndexed { index, c ->
            if (normalizedS[normalizedS.length - index - 1] != c) {
                isPal = false
            }
        }
        return isPal
    }
}
