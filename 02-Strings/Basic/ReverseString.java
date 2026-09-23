// Problem: Reverse a String
// Level: Basic | LeetCode: 344 - Reverse String
// Hinglish: String ke characters ko ulte order mein arrange karna hai.

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;

        // Dono ends ke characters swap karte jao jab tak pointers mil na jaayein.
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        System.out.println(new String(chars)); // Output: olleh
    }
}
