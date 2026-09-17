package com.DSAPractice.Array;

public class ssmallest {

    // Find the second smallest DISTINCT element in the array.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int secondSmallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Check every element once.
        for (int i = 0; i < arr.length; i++) {

            // Current element becomes the new smallest.
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            // Update second smallest only for a distinct value.
            else if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {

        int[] arr = {15, 20, 8, 5, 10};

        int result = secondSmallest(arr);

        System.out.println("Second Smallest: " + result);
    }
}