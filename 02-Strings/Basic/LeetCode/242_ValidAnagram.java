/**
 * LeetCode 242 - Valid Anagram
 *
 * Check karna hai ki dono strings mein same characters same frequency ke saath hain ya nahi.
 *
 * Approach: Character frequency count.
 * Time Complexity: O(n)
 * Space Complexity: O(1) for lowercase English letters
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Anagram: " + isAnagram("listen", "silent"));
    }
}

/* Output: Anagram: true */
