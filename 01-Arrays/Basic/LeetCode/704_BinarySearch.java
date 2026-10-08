/**
 * LeetCode 704 - Binary Search
 *
 * Sorted array mein target ka index find karna hai.
 *
 * Approach: Middle element check karke search space half karte hain.
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class BinarySearch {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Target chhota hai to left half mein search karo
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                // Target bada hai to right half mein search karo
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11};
        System.out.println("Index: " + search(nums, 7));
    }
}

/* Output: Index: 3 */
