package com.DSAPractice.Array;

public class Sorted {

    // Check karna hai ki array sorted order mein hai ya nahi
    // Equal adjacent values allowed hain
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static boolean isSorted(int[] arr) {

        // Har element ko next element ke saath compare karenge
        for (int i = 0; i < arr.length - 1; i++) {

            // Agar current element next se bada hai toh array sorted nahi hai
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // Koi decreasing pair nahi mila, matlab array sorted hai
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {100, 120, 20, 30, 30, 40, 50};

        boolean result = isSorted(arr);

        System.out.println("Is Sorted: " + result);
    }
}