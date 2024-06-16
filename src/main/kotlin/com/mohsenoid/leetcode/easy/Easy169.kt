package org.example.com.mohsenoid.leetcode.easy

/**
 * 169. Majority Element
 * https://leetcode.com/problems/majority-element/
 *
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 *
 *
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 *
 * Constraints:
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 */
object Easy169 {
    fun majorityElementV1(nums: IntArray): Int {
        val temp = mutableMapOf<Int, Int>()

        var i = 0

        while (i < nums.size) {
            temp[nums[i]] = temp.getOrDefault(nums[i], 0) + 1
            i++
        }

        val result = temp.maxBy { it.value }.key

        return result
    }

    fun majorityElementV2(nums: IntArray): Int {
        var maxCount = 0
        var index = -1

        var i = 0

        while (i < nums.size) {
            var j = 0
            var count = 0
            while (j < nums.size) {
                if (nums[i] == nums[j]) {
                    count++
                }
                j++
            }
            if (count > maxCount) {
                maxCount = count
                index = i
            }

            i++
        }

        return nums[index]
    }

    fun majorityElement(nums: IntArray): Int {
        var candidate = 0
        var count = 0

        var i = 0

        while (i < nums.size) {
            if (count == 0) {
                candidate = nums[i]
            }
            count += if (nums[i] == candidate) +1 else -1

            i++
        }

        return candidate
    }
}