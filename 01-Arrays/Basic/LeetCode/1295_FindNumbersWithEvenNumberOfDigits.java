package com.DSAPractice.Array.Basic.LeetCode;

public class FindNumbersWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        int count = 0;

        // Har number ko check karenge ki usme even number of digits hain ya nahi
        for (int num : nums) {
            int digits = 0;

            // Number ko 10 se divide karke digits count kar rahe hain
            while (num > 0) {
                num = num / 10;
                digits++;
            }

            // Agar digits even hain toh count increase karo
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));
    }
}

/*
LeetCode: 1295 - Find Numbers with Even Number of Digits
Time Complexity: O(n * d)
Space Complexity: O(1)
*/
