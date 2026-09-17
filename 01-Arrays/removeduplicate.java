package com.DSAPractice.Array;

public class removeduplicate {

    // Remove duplicates from a SORTED array in-place.
    // Returns the number of unique elements.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int duplicate(int[] arr) {

        // i points to the last unique element.
        int i = 0;

        // j scans the remaining elements.
        for (int j = 1; j < arr.length; j++) {

            // A new unique element is found.
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Unique elements are stored from index 0 to i.
        return i + 1;
    }

    public static void main(String[] args) {

        // Important: the input array must be sorted.
        int[] arr = {2, 2, 3, 5, 5, 6};

        int result = duplicate(arr);

        // Print only the unique elements.
        for (int k = 0; k < result; k++) {
            System.out.println(arr[k]);
        }
    }
}