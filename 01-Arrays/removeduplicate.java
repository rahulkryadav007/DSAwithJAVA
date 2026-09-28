package com.DSAPractice.Array;

public class removeduplicate {

    // Sorted array se duplicates remove karne hain
    // Array ko in-place modify karke unique elements ka count return karenge
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int duplicate(int[] arr) {

        // i last unique element ko point karega
        int i = 0;

        // j baaki elements ko scan karega
        for (int j = 1; j < arr.length; j++) {

            // Agar new unique element mila toh usko next position par rakho
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Index 0 se i tak unique elements hain
        return i + 1;
    }

    public static void main(String[] args) {

        // Important: input array sorted hona chahiye
        int[] arr = {2, 2, 3, 5, 5, 6};

        int result = duplicate(arr);

        // Sirf unique elements print kar rahe hain
        for (int k = 0; k < result; k++) {
            System.out.println(arr[k]);
        }
    }
}