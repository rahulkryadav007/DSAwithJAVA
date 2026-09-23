package com.DSAPractice.Array;

public class CountPositiveNegativeZero {

    // Array mein positive, negative aur zero count karna
    public static void CountNumbers(int[] arr) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Har element ko check karenge
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }

    public static void main(String[] args) {

        int[] arr = {2, -3, 0, 7, -1, 0, 5};

        CountNumbers(arr);
    }
}

/*
Output:
Positive numbers: 3
Negative numbers: 2
Zeros: 2

Time Complexity: O(n)
Space Complexity: O(1)
*/