package com.DSAPractice.Array;

public class ssmallest {

    // Array mein second smallest DISTINCT element find karna hai
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int secondSmallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Har element ko ek baar check karenge
        for (int i = 0; i < arr.length; i++) {

            // Agar current element smallest se chhota hai
            // toh purana smallest second smallest ban jayega
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            // Distinct value milne par second smallest update karo
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