package com.DSAPractice.Array;

class Solution {

    // Find the second largest DISTINCT element in the array.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Check every element once.
        for (int i = 0; i < arr.length; i++) {

            // Current element becomes the new largest.
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            // Update second largest only for a distinct value.
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {25, 30, 10, 26, 40};

        Solution obj = new Solution();
        int result = obj.secondLargest(arr);

        System.out.println("Second Largest: " + result);
    }
}