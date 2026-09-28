package com.DSAPractice.Array.Basic.LeetCode;

public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums) {

        int[] result = new int[nums.length];

        // Har index par nums[nums[i]] value rakhni hai
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] result = buildArray(nums);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

/*
LeetCode: 1920 - Build Array from Permutation
Time Complexity: O(n)
Space Complexity: O(n)
*/
