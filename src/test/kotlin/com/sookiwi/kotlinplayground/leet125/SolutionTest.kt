package com.sookiwi.kotlinplayground.leet125

import io.kotlintest.properties.assertAll
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

private val solution = Solution()

class SolutionTest : StringSpec({
    "length should return size of string" {
        "hello".length shouldBe 5
    }
    "test" {
        solution.isPalindrome("A man, a plan, a canal: Panama") shouldBe true
    }
    "test2" {
        solution.isPalindrome("race a car") shouldBe false
    }
    "test3" {
        assertAll { a: String, b: String ->
            (a + b).length shouldBe a.length + b.length
        }
    }
})
