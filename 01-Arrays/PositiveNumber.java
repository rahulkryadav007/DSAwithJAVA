package com.DSAPractice.Array;

public class PositiveNumber {

    public static int missingNumber(int[] arr) {

        int n = arr.length;

        // Step 1: Put every positive number at its correct index
        for (int i = 0; i < n; i++) {

            while (arr[i] >= 1
                    && arr[i] <= n
                    && arr[arr[i] - 1] != arr[i]) {

                int temp = arr[i];

                arr[i] = arr[temp - 1];

                arr[temp - 1] = temp;
            }
        }

        // Step 2: Find the first missing positive number
        for (int i = 0; i < n; i++) {

            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If 1 to n are all present
        return n + 1;
    }

    public static void main(String[] args) {

        int[] arr = {2, -3, 4, 1, 1, 7};

        int result = missingNumber(arr);

        System.out.println("First Missing Positive: " + result);
    }
}