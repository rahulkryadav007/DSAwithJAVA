// LeetCode 567 - Permutation in String
// Pattern: Fixed Window + Frequency Array

class PermutationInString {
    static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : s1.toCharArray()) {
            need[ch - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            window[s2.charAt(i) - 'a']++;

            if (i >= k) {
                window[s2.charAt(i - k) - 'a']--;
            }

            if (i >= k - 1 && same(need, window)) {
                return true;
            }
        }

        return false;
    }

    static boolean same(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}
