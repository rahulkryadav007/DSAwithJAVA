// Problem: Valid Palindrome | LeetCode 125
// Check whether a string reads the same forward and backward.
public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        int left = 0, right = s.length() - 1;
        boolean palindrome = true;
        // Left aur right characters compare karo; mismatch mila toh palindrome nahi.
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(palindrome);
    }
}
