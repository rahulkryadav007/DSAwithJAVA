package com.DSAPractice.Array;

public class Reverse {

    // Reverse the array using two pointers.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void reverse(int[] arr) {

        int left = 0;                  // Start pointer
        int right = arr.length - 1;    // End pointer

        // Continue until both pointers meet.
        while (left < right) {

            // Swap elements at left and right.
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move both pointers towards the center.
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reverse(arr);

        // Print the reversed array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}