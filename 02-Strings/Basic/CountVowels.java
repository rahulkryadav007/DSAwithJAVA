// Problem: Count vowels in a string | Basic practice
public class CountVowels {
    public static void main(String[] args) {
        String s = "education".toLowerCase();
        int count = 0;
        // Har character check karo ki vowel hai ya nahi.
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        System.out.println(count); // Output: 5
    }
}
