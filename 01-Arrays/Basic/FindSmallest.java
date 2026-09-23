// Problem: Find the smallest element in an array
// Level: Easy | Pattern: Traversal
// Approach: Track the minimum value while scanning the array.
// Time: O(n) | Space: O(1)

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallest {
    public static int findSmallest(int[] arr) {
        int min = arr[0]; // Starting element ko smallest maan rahe hain
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Chhota element mila toh min update karo
            }
        }
        return min;
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
        System.out.println("Smallest element: " + findSmallest(arr));
        sc.close();
    }
}

/* Sample input:
5
12 5 28 7 19
Output: Smallest element: 5
*/