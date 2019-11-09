package com.sookiwi.kotlinplayground.leet121

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

private val solution = Solution()

class SolutionTest : StringSpec({
    "test" {
        solution.maxProfit(intArrayOf(7,1,5,3,6,4)) shouldBe 5
        solution.maxProfit(intArrayOf(7,6,4,3,1)) shouldBe 0
    }
})
