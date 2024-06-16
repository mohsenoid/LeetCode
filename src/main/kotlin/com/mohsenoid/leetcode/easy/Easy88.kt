package com.mohsenoid.leetcode.easy

/**
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array
 *
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 *
 * Example 2:
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 *
 * Example 3:
 *
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 *
 *
 * Constraints:
 *
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 *
 *
 * Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */

object Easy88 {

    fun mergeV1(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        repeat(n) { i ->
            nums1[m + i] = nums2[i]
        }
        nums1.sort()
    }

    fun mergeV2(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val result = IntArray(m + n)
        var i = 0
        var j = 0
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[i + j] = nums1[i]
                i++
            } else {
                result[i + j] = nums2[j]
                j++
            }
        }

        if (i < m) {
            repeat(m - i) { k ->
                result[k + j + i] = nums1[i + k]
            }
        }

        if (j < n) {
            repeat(n - j) { k ->
                result[k + j + i] = nums2[j + k]
            }
        }

        result.forEachIndexed { index, i ->
            nums1[index] = i
        }
    }

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val nums1Copy = nums1.copyOf(m)
        var i = 0
        var j = 0
        while (i < m && j < n) {
            if (nums1Copy[i] < nums2[j]) {
                nums1[i + j] = nums1Copy[i]
                i++
            } else {
                nums1[i + j] = nums2[j]
                j++
            }
        }

        if (i < m) {
            repeat(m - i) { k ->
                nums1[k + j + i] = nums1Copy[i + k]
            }
        }

        if (j < n) {
            repeat(n - j) { k ->
                nums1[k + j + i] = nums2[j + k]
            }
        }
    }
}
