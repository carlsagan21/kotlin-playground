package com.sookiwi.kotlinplayground.leet121

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var min = Int.MAX_VALUE
        prices.forEach {
            if (min < it) {
                profit = maxOf(it - min, profit)
            } else {
                min = it
            }
        }
        return profit
    }
}
