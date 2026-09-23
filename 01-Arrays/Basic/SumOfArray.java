// Problem: Find the sum of all array elements
// Level: Easy | Pattern: Traversal
// Approach: Add every element to a running total.
// Time: O(n) | Space: O(1)

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static int sum(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value; // Har element ko total mein add karo
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum(arr));
        sc.close();
    }
}

/* Sample input: 5 | 1 2 3 4 5
Output: Sum: 15
*/