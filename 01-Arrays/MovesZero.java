package com.DSAPractice.Array;

public class MovesZero {

    // Saare zero ko end mein move karna hai aur non-zero ka order same rakhna hai
    // Iske liye two-pointer approach use kar rahe hain
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void moves(int[] arr) {

        // i batayega ki next non-zero element kaha rakhna hai
        int i = 0;

        // j array ke har element ko check karega
        for (int j = 0; j < arr.length; j++) {

            // Agar non-zero element mila toh usko i position par rakho
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

        // Updated array ko print kar rahe hain
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}