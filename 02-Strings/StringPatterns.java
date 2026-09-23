import java.util.*;

// Intermediate patterns: frequency map + sliding window
public class StringPatterns {
    // Anagram: same characters aur same frequency, order different ho sakta hai.
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] freq = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;   // pehle String se count badhao
            freq[b.charAt(i)]--;   // doosre se count ghatao
        }
        for (int count : freq) if (count != 0) return false;
        return true;
    }

    // First unique character ka index; nahi mila toh -1.
    static int firstNonRepeatingIndex(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }

    // Duplicate characters hatao, pehli occurrence ka order preserve rahega.
    static String removeDuplicates(String s) {
        Set<Character> seen = new LinkedHashSet<>();
        for (char ch : s.toCharArray()) seen.add(ch);
        StringBuilder result = new StringBuilder();
        for (char ch : seen) result.append(ch);
        return result.toString();
    }

    // Advanced: longest substring without repeating characters.
    // Sliding window ko valid rakhne ke liye last-seen index track karte hain.
    static int longestUniqueSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0, best = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (lastSeen.containsKey(ch) && lastSeen.get(ch) >= left) {
                left = lastSeen.get(ch) + 1; // duplicate ke aage window shift
            }
            lastSeen.put(ch, right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(firstNonRepeatingIndex("aabbcddee")); // 4 ('c')
        System.out.println(removeDuplicates("programming")); // progamin
        System.out.println(longestUniqueSubstring("abcabcbb")); // 3: "abc"
    }
}
