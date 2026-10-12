import java.util.Arrays;

/**
 * Two Pointers: Two Sum in a sorted array.
 *
 * Example:
 * Input:  numbers = [1, 2, 4, 6, 10], target = 8
 * Output: [2, 4]  // 1-based indices
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class TwoSumSorted {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // LeetCode-style answer uses 1-based indices.
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                // Sum is too small: move left pointer to increase it.
                left++;
            } else {
                // Sum is too large: move right pointer to decrease it.
                right--;
            }
        }

        return new int[0]; // No valid pair found.
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 10};
        int target = 8;

        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result)); // Output: [2, 4]
    }
}
