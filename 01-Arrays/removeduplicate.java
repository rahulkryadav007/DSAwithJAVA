package com.DSAPractice.Array;

public class removeduplicate {

    public static int duplicate(int[] arr) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {

                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 5, 5, 6};

        int result = duplicate(arr);

        for (int k = 0; k < result; k++) {
            System.out.println(arr[k]);
        }
    }
}