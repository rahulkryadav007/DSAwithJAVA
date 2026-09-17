package com.DSAPractice.Array;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 10, 15, 5};
        int target = 20;

        int[] result = twoSum(arr, target);

        System.out.println("Index: [" + result[0] + ", " + result[1] + "]");
    }
}