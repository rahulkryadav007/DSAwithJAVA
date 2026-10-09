/*
 * LeetCode 1480: Running Sum of 1D Array
 * Difficulty: Easy
 * Topic: Arrays, Prefix Sum
 *
 * Hinglish:
 * Har index par ab tak ke saare elements ka total store karna hai.
 * Current element ko previous running sum ke saath add kar do.
 */

class Solution {
    public int[] runningSum(int[] nums) {
        // Pehle element se running sum start hota hai.
        for (int i = 1; i < nums.length; i++) {
            // Current value mein previous total add kar rahe hain.
            nums[i] = nums[i] + nums[i - 1];
        }

        // Updated array hi answer hai.
        return nums;
    }
}

/*
 * Example:
 * Input:  [1, 2, 3, 4]
 * Output: [1, 3, 6, 10]
 *
 * Dry run:
 * i = 1 -> nums[1] = 2 + 1 = 3  => [1, 3, 3, 4]
 * i = 2 -> nums[2] = 3 + 3 = 6  => [1, 3, 6, 4]
 * i = 3 -> nums[3] = 4 + 6 = 10 => [1, 3, 6, 10]
 *
 * Time Complexity: O(n) - array ko ek baar traverse karte hain.
 * Auxiliary Space: O(1) - input array ko in-place update karte hain.
 *
 * Note: LeetCode par method ko Solution class ke andar submit karein.
 */
