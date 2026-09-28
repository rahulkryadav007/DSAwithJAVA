package com.DSAPractice.Array;

public class TwoSum {

    // Har possible pair ko check karke target find kar rahe hain
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int[] twoSum(int[] arr, int target) {

        // Pehla element choose kar rahe hain
        for (int i = 0; i < arr.length; i++) {

            // i ke baad wala second element choose kar rahe hain
            for (int j = i + 1; j < arr.length; j++) {

                // Check kar rahe hain ki dono ka sum target ke equal hai ya nahi
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        // Agar valid pair nahi mila toh -1 return kar rahe hain
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 10, 15, 5};
        int target = 20;

        int[] result = twoSum(arr, target);

        System.out.println("Index: [" + result[0] + ", " + result[1] + "]");
    }
}