package com.DSAPractice.Array;

class Solution {

    public int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
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

        System.out.println(result);
    }
}