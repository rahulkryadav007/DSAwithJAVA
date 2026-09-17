package com.DSAPractice.Array;

public class TwoSum {

    // Brute Force approach: Check every possible pair.
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int[] twoSum(int[] arr, int target) {

        // Pick the first element.
        for (int i = 0; i < arr.length; i++) {

            // Pick the second element after i.
            for (int j = i + 1; j < arr.length; j++) {

                // Check whether the pair adds up to target.
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        // Return -1 when no valid pair is found.
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 10, 15, 5};
        int target = 20;

        int[] result = twoSum(arr, target);

        System.out.println("Index: [" + result[0] + ", " + result[1] + "]");
    }
}