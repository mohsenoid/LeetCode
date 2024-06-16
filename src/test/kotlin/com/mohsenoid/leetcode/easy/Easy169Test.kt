package com.mohsenoid.leetcode.easy

import org.example.com.mohsenoid.leetcode.easy.Easy169
import kotlin.test.Test
import kotlin.test.assertEquals

class Easy169Test {

    @Test
    fun test1() {
        val nums = intArrayOf(3, 2, 3)
        val expected = 3

        val actual = Easy169.majorityElement(nums)

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        val expected = 2

        val actual = Easy169.majorityElement(nums)

        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1)
        val expected = 1

        val actual = Easy169.majorityElement(nums)

        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val nums = intArrayOf(3, 3, 4)
        val expected = 3

        val actual = Easy169.majorityElement(nums)

        assertEquals(expected, actual)
    }
}