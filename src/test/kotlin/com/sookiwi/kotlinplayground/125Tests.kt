package com.sookiwi.kotlinplayground

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

@Suppress("MemberVisibilityCanBePrivate")
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

    @Test
    fun test() {
        assertThat(isPalindrome("A man, a plan, a canal: Panama")).isTrue()
        assertThat(isPalindrome("race a car")).isFalse()
    }
}
