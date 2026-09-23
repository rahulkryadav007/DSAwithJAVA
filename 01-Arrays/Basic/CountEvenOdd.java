// Problem: Count even and odd numbers in an array
// Level: Easy | Pattern: Traversal
// Approach: Check remainder when each number is divided by 2.
// Time: O(n) | Space: O(1)

import java.util.Scanner;
import java.util.Arrays;

public class CountEvenOdd {
    public static void count(int[] arr) {
        int even = 0, odd = 0;
        for (int value : arr) {
            if (value % 2 == 0) even++; // 2 se divide hone par remainder 0 = even
            else odd++;
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
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
        count(arr);
        sc.close();
    }
}

/* Sample input:
5
1 2 3 4 6
Output:
Even count: 3
Odd count: 2
*/