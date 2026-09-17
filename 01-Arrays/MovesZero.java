package com.DSAPractice.Array;

public class MovesZero {

    // Move all zeroes to the end while keeping non-zero elements in order.
    // Two-pointer approach.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void moves(int[] arr) {

        int i = 0; // Position where the next non-zero element should go.

        // j scans every element of the array.
        for (int j = 0; j < arr.length; j++) {

            // When a non-zero element is found, place it at index i.
            if (arr[j] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moves(arr);

        // Print the modified array.
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}