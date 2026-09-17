package com.DSAPractice.Array;

public class Sort012 {

    // Sort an array containing only 0, 1, and 2.
    // Uses the Dutch National Flag / three-pointer approach.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void sort(int[] arr) {

        int low = 0;                  // Boundary for 0s
        int mid = 0;                  // Current element
        int high = arr.length - 1;    // Boundary for 2s

        while (mid <= high) {

            // 0 belongs to the left side.
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            // 1 is already in its correct middle region.
            } else if (arr[mid] == 1) {
                mid++;

            // 2 belongs to the right side.
            // Do not increment mid because the swapped value
            // from high still needs to be checked.
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        sort(arr);

        // Print the sorted array.
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}