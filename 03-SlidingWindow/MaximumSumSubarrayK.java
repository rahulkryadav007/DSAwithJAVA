// Maximum Sum of a Subarray of Size K
// Pattern: Fixed Size Sliding Window
// Example: arr = [2, 1, 5, 1, 3, 2], k = 3
// Answer = 9

class MaximumSumSubarrayK {
    static int maxSum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            // Jab window ka size k ho jaye
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i - k + 1];
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSum(arr, 3));
    }
}
