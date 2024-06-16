package com.mohsenoid.leetcode.easy

import org.example.com.mohsenoid.leetcode.easy.Easy26
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test
import kotlin.test.assertContentEquals

class Easy26Test {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2)

        val expectedResult = 2
        val actualResult = Easy26.removeDuplicates(nums)

        assertEquals(expectedResult, actualResult)

        val expectedNums = intArrayOf(1, 2)
        val actualNums = nums.copyOfRange(0, actualResult)

        assertContentEquals(expectedNums, actualNums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

        val expectedResult = 5
        val actualResult = Easy26.removeDuplicates(nums)

        assertEquals(expectedResult, actualResult)

        val expectedNums = intArrayOf(0, 1, 2, 3, 4)
        val actualNums = nums.copyOfRange(0, actualResult)

        assertContentEquals(expectedNums, actualNums)
    }
}
