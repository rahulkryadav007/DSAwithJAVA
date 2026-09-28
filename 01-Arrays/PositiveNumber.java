package com.DSAPractice.Array;

public class PositiveNumber {

    // Array mein sabse chhota missing positive number find karna hai
    // Example: [3, 4, -1, 1] -> 2
    // Time Complexity: O(n)
    // Space Complexity: O(1) extra space
    public static int missingNumber(int[] arr) {

        int n = arr.length;

        // Har number x ko uski correct position x - 1 par rakhne ki koshish karenge
        // Negative, zero aur n se bade numbers ko ignore karenge
        for (int i = 0; i < n; i++) {

            while (arr[i] >= 1
                    && arr[i] <= n
                    && arr[arr[i] - 1] != arr[i]) {

                int temp = arr[i];

                // Current value ko uski correct position par move karo
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Jis index par value i + 1 nahi hai, wahi missing number hai
        for (int i = 0; i < n; i++) {

            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // Agar 1 se n tak sab numbers present hain, toh answer n + 1 hoga
        return n + 1;
    }

    public static void main(String[] args) {

        int[] arr = {2, -3, 4, 1, 1, 7};

        int result = missingNumber(arr);

        System.out.println("First Missing Positive: " + result);
    }
}