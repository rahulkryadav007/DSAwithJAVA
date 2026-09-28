package com.DSAPractice.Array.Basic.LeetCode;

public class RunningSumOf1dArray {

    // Har position par ab tak ke saare elements ka sum store karenge
    public static int[] runningSum(int[] nums) {

        // First element ka running sum wahi element hoga
        for (int i = 1; i < nums.length; i++) {

            // Previous sum mein current element add kar rahe hain
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = runningSum(nums);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

/*
LeetCode: 1480 - Running Sum of 1d Array
Time Complexity: O(n)
Space Complexity: O(1)
*/
