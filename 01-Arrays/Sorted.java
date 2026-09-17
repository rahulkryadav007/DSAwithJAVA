package com.DSAPractice.Array;

public class Sorted {

    // Check whether the array is sorted in non-decreasing order.
    // Equal adjacent values are allowed.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static boolean isSorted(int[] arr) {

        // Compare each element with the next element.
        for (int i = 0; i < arr.length - 1; i++) {

            // If the current element is greater than the next,
            // the array is not sorted.
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // No decreasing pair was found.
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {100, 120, 20, 30, 30, 40, 50};

        boolean result = isSorted(arr);

        System.out.println("Is Sorted: " + result);
    }
}