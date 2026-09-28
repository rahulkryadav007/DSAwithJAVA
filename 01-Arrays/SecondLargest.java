package com.DSAPractice.Array;

class Solution {

    // Array mein second largest DISTINCT element find karna hai
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Har element ko ek baar check karenge
        for (int i = 0; i < arr.length; i++) {

            // Agar current element largest se bada hai
            // toh purana largest second largest ban jayega
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            // Distinct value milne par second largest update karo
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {25, 30, 10, 26, 40};

        Solution obj = new Solution();
        int result = obj.secondLargest(arr);

        System.out.println("Second Largest: " + result);
    }
}