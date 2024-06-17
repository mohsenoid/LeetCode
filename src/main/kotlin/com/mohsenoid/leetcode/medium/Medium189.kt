package org.example.com.mohsenoid.leetcode.medium


/**
 * 189. Rotate Array
 * https://leetcode.com/problems/rotate-array/
 *
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 *
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 *
 * Constraints:
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 *
 *
 * Follow up:
 * Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
object Medium189 {

    fun rotateV1(nums: IntArray, k: Int) {
        if (nums.isEmpty() || nums.size == 1) return

        val r = k % nums.size
        if (r == 0) return

        var i = 0
        while (i < r) {
            var temp = nums[0]
            var j = 0

            while (j < nums.size - 1) {
                val temp2 = nums[j + 1]
                nums[j + 1] = temp
                temp = temp2
                j++
            }
            nums[0] = temp
            i++
        }
    }

    fun rotatev2(nums: IntArray, k: Int) {
        if (nums.size < 2 || k % nums.size == 0) return
        val r = nums.size - (k % nums.size)

        val temp = nums.sliceArray(r until nums.size) + nums.sliceArray(0 until r)
        temp.forEachIndexed { index, i -> nums[index] = i }
    }

    fun rotate(nums: IntArray, k: Int) {
        if (nums.isEmpty() || nums.size == 1) return

        val r = k % nums.size
        if (r == 0) return

        val temp = nums.clone()
        var i = 0
        while (i < nums.size) {
            nums[(i + r) % (nums.size)] = temp[i]
            i++
        }
    }
}