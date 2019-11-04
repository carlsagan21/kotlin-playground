package com.sookiwi.kotlinplayground.leet125

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test125() {
        Assertions.assertThat(solution.isPalindrome("A man, a plan, a canal: Panama")).isTrue()
        Assertions.assertThat(solution.isPalindrome("race a car")).isFalse()
    }
}
