package com.DSAPractice.Array;

public class ssmallest {

    public static int secondsmallest(int[] arr) {

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < a) {
                b = a;
                a = arr[i];

            } else if (arr[i] < b && arr[i] > a) {
                b = arr[i];
            }
        }

        return b;
    }

    public static void main(String[] args) {

        int[] arr = {15, 20, 8, 5, 10};

        int secondSmallest = secondsmallest(arr);

        System.out.println(secondSmallest);
    }
}