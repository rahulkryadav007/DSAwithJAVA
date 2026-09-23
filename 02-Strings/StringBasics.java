// String basics + beginner practice
// Har method ko alag se call karke practice karo.

public class StringBasics {
    public static void main(String[] args) {
        String text = "Rahul";

        System.out.println("Length: " + text.length());
        System.out.println("First char: " + text.charAt(0));

        // String immutable hoti hai; uppercase result ko store karna padta hai.
        text = text.toUpperCase();
        System.out.println("Uppercase: " + text);

        printCharacters("JAVA");
        System.out.println("Vowels: " + countVowels("Education"));
        System.out.println("Palindrome: " + isPalindrome("madam"));
        System.out.println("Reverse: " + reverse("hello"));
    }

    // Basic 1: Har index par jaakar character print karo.
    static void printCharacters(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Index " + i + " = " + s.charAt(i));
        }
    }

    // Basic 2: Vowels count karo; lowercase conversion se A/E/I/O/U bhi cover honge.
    static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // Basic 3: Dono ends se compare karo; mismatch mila toh palindrome nahi.
    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Basic 4: String ko char array mein badal kar in-place swap karo.
    static String reverse(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
