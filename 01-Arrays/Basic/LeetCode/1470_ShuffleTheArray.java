package com.DSAPractice.Array.Basic.LeetCode;

public class ShuffleTheArray {

    // Array mein pehle x elements aur phir y elements diye hain.
    // Humein unhe alternate order mein arrange karna hai.
    // Example: [2,5,1,3,4,7] -> [2,3,5,4,1,7]
    public static int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        int index = 0;

        // Pehle x aur y ka pair bana kar result mein daalenge
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = shuffle(nums, n);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

/*
LeetCode: 1470 - Shuffle the Array
Time Complexity: O(n)
Space Complexity: O(n)
*/
