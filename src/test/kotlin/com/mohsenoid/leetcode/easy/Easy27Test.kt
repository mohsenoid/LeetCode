package com.mohsenoid.leetcode.easy

import org.example.com.mohsenoid.leetcode.easy.Easy27
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Easy27Test {

    @Test
    fun test1() {
        val nums = intArrayOf(3, 2, 2, 3)
        val `val` = 3

        val expectedResult = 2
        val actualResult = Easy27.removeElement(nums = nums, `val` = `val`)

        assertEquals(expectedResult, actualResult)

        val expectedNums = intArrayOf(2, 2)
        val actualNums = nums.copyOfRange(0, actualResult)

        assertContentEquals(expectedNums, actualNums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val `val` = 2

        val expectedResult = 5
        val actualResult = Easy27.removeElement(nums = nums, `val` = `val`)

        assertEquals(expectedResult, actualResult)

        val expectedNums = intArrayOf(0, 1, 3, 0, 4)
        val actualNums = nums.copyOfRange(0, actualResult)

        assertContentEquals(expectedNums, actualNums)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2)
        val `val` = 3

        val expectedResult = 1
        val actualResult = Easy27.removeElement(nums = nums, `val` = `val`)

        assertEquals(expectedResult, actualResult)

        val expectedNums = intArrayOf(2)
        val actualNums = nums.copyOfRange(0, actualResult)

        assertContentEquals(expectedNums, actualNums)
    }
}
