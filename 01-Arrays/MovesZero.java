package com.DSAPractice.Array;

public class MovesZero {

    public static void Moves(int[] arr) {

        int i = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        Moves(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}