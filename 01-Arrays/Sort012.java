package com.DSAPractice.Array;

public class Sort012 {

    // Array mein sirf 0, 1 aur 2 hain, inko sort karna hai
    // Dutch National Flag / three-pointer approach use kar rahe hain
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void sort(int[] arr) {

        // low 0 ki boundary, mid current element aur high 2 ki boundary hai
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            // 0 ko left side mein bhejna hai
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            // 1 already middle region mein sahi jagah par hai
            } else if (arr[mid] == 1) {
                mid++;

            // 2 ko right side mein bhejna hai
            // High se aaye element ko check karne ke liye mid ko same rakhenge
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        sort(arr);

        // Sorted array ko print kar rahe hain
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}