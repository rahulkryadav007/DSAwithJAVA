// Problem: Array mein largest element find karna
// Level: Easy | Pattern: Traversal
// Approach: Har element ko check karke maximum value track karenge
// Time: O(n) | Space: O(1)

import java.util.Scanner;
import java.util.Arrays;

public class FindLargest {
    public static int findLargest(int[] arr) {
        int max = arr[0]; // Pehle element ko abhi tak ka largest maan rahe hain

        // Baaki elements ko ek-ek karke check karenge
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Bada element mila toh max update karo
            }
        }
        return max;
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
        System.out.println("Largest element: " + findLargest(arr));
        sc.close();
    }
}

/* Sample input:
5
12 5 28 7 19
Output: Largest element: 28
*/