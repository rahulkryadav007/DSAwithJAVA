/**
 * LeetCode 125 - Valid Palindrome
 *
 * Letters aur digits ko consider karke check karna hai ki string palindrome hai ya nahi.
 *
 * Approach: Two pointers from both ends.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Non-alphanumeric characters skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Palindrome: " + isPalindrome(s));
    }
}

/* Output: Palindrome: true */
