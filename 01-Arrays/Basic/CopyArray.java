package com.DSAPractice.Array;

public class CopyArray {

    // Ek array ke elements ko dusre array mein copy karna
    public static int[] Copy(int[] arr) {

        int[] copy = new int[arr.length];

        // Same index par element copy karenge
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        return copy;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] result = Copy(arr);

        // Copied array print karenge
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

/*
Output: 10 20 30 40 50

Time Complexity: O(n)
Space Complexity: O(n)
*/