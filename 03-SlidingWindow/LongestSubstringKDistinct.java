// Longest Substring with At Most K Distinct Characters
// Pattern: Variable Size Sliding Window + HashMap

import java.util.*;

class LongestSubstringKDistinct {
    static int longest(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longest("eceba", 2));
    }
}
