package com.DSAPractice.Array;

public class PositiveNumber {

    // Find the smallest missing positive integer.
    // Example: [3, 4, -1, 1] -> 2
    // Time Complexity: O(n)
    // Space Complexity: O(1) extra space
    public static int missingNumber(int[] arr) {

        int n = arr.length;

        // Step 1: Put each number x at index x - 1.
        // Ignore negative numbers, zero, and numbers greater than n.
        for (int i = 0; i < n; i++) {

            while (arr[i] >= 1
                    && arr[i] <= n
                    && arr[arr[i] - 1] != arr[i]) {

                int temp = arr[i];

                // Move the current value to its correct position.
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Step 2: The first index whose value is not i + 1
        // represents the missing positive number.
        for (int i = 0; i < n; i++) {

            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If 1 to n are present, the answer is n + 1.
        return n + 1;
    }

    public static void main(String[] args) {

        int[] arr = {2, -3, 4, 1, 1, 7};

        int result = missingNumber(arr);

        System.out.println("First Missing Positive: " + result);
    }
}