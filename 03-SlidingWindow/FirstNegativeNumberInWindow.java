// First Negative Number in Every Window of Size K
// Pattern: Sliding Window + Queue
// Example: [12, -1, -7, 8, -15, 30, 16, 28], k = 3
// Output: [-1, -1, -7, -15, -15, 0]

import java.util.*;

class FirstNegativeNumberInWindow {
    static void firstNegative(int[] arr, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                queue.offer(arr[i]);
            }

            if (i >= k - 1) {
                System.out.print((queue.isEmpty() ? 0 : queue.peek()) + " ");

                if (!queue.isEmpty() && queue.peek() == arr[i - k + 1]) {
                    queue.poll();
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        firstNegative(arr, 3);
    }
}
