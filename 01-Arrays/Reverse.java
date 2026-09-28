package com.DSAPractice.Array;

public class Reverse {

    // Array ko reverse karne ke liye two pointers use kar rahe hain
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void reverse(int[] arr) {

        // Left pointer start se aur right pointer end se start hoga
        int left = 0;
        int right = arr.length - 1;

        // Jab tak dono pointers center tak nahi pahuchte
        while (left < right) {

            // Left aur right ke elements ko swap karo
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Dono pointers ko center ki taraf move karo
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reverse(arr);

        // Reversed array ko print kar rahe hain
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}