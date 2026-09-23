package com.DSAPractice.Array;

public class CountOccurrences {

    // Given element array mein kitni baar aaya, count karna
    public static int Count(int[] arr, int target) {

        int count = 0;

        // Har element ko target se compare karenge
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 8, 2, 9, 5};
        int target = 2;

        System.out.println(target + " occurs " + Count(arr, target) + " times");
    }
}

/*
Output: 2 occurs 3 times

Time Complexity: O(n)
Space Complexity: O(1)
*/