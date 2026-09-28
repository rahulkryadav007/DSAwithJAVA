// Problem: Linear Search se target find karna
// Level: Easy | Pattern: Traversal
// Approach: Har element ko check karke target se match karenge
// Time: O(n) | Space: O(1)

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] arr, int target) {

        // Array ke har element ko check karenge
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i; // Match mila toh index return karo
        }
        return -1; // Target nahi mila toh -1 return karo
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
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = search(arr, target);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println(index == -1 ? "Target not found" : "Target found at index: " + index);
        sc.close();
    }
}

/* Sample input:
5
4 8 2 9 6
9
Output: Target found at index: 3
*/