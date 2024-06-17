package com.mohsenoid.leetcode.medium

import org.example.com.mohsenoid.leetcode.medium.Medium189
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Medium189Test {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val k = 3

        Medium189.rotate(nums, k)

        val expectedNums = intArrayOf(5, 6, 7, 1, 2, 3, 4)

        assertContentEquals(expectedNums, nums)

    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, -100, 3, 99)
        val k = 2

        Medium189.rotate(nums, k)

        val expectedNums = intArrayOf(3, 99, -1, -100)

        assertContentEquals(expectedNums, nums)

    }
}