package com.mohsenoid.leetcode.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Easy88Test {

    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val m = 3
        val nums2 = intArrayOf(2, 5, 6)
        val n = 3

        val expected = intArrayOf(1, 2, 2, 3, 5, 6)

        Easy88.merge(nums1 = nums1, m = m, nums2 = nums2, n = n)

        assertContentEquals(expected, nums1)
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1)
        val m = 1
        val nums2 = intArrayOf()
        val n = 0

        val expected = intArrayOf(1)

        Easy88.merge(nums1 = nums1, m = m, nums2 = nums2, n = n)

        assertContentEquals(expected, nums1)
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(2, 0)
        val m = 1
        val nums2 = intArrayOf(1)
        val n = 1

        val expected = intArrayOf(1, 2)

        Easy88.merge(nums1 = nums1, m = m, nums2 = nums2, n = n)

        assertContentEquals(expected, nums1)
    }
}
