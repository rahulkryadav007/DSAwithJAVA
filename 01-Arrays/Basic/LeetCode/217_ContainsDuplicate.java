/**
 * LeetCode 217 - Contains Duplicate
 *
 * Check karna hai ki array mein koi value repeat ho rahi hai ya nahi.
 *
 * Approach: HashSet mein values store karte hain.
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 */
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // Agar value pehle se hai, duplicate mil gaya
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    }
}

/* Output: Contains Duplicate: true */
