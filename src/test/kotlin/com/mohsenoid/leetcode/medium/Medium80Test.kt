package com.mohsenoid.leetcode.medium

import org.example.com.mohsenoid.leetcode.medium.Medium80
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Medium80Test {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)

        val expectedResult = 5
        val actualResult = Medium80.removeDuplicates(nums)

        assertEquals(expectedResult, actualResult)

        val expectedNums = intArrayOf(1, 1, 2, 2, 3)
        val actualNums = nums.copyOfRange(0, actualResult)

        assertContentEquals(expectedNums, actualNums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0,0,1,1,1,1,2,3,3)

        val expectedResult = 7
        val actualResult = Medium80.removeDuplicates(nums)

        assertEquals(expectedResult, actualResult)

        val expectedNums = intArrayOf(0,0,1,1,2,3,3)
        val actualNums = nums.copyOfRange(0, actualResult)

        assertContentEquals(expectedNums, actualNums)
    }


}
