# 02 - Strings in Java ☕

> My Strings notes: understand the idea first, dry-run it, then code it. Hinglish comments are added where they make the logic easier to remember.

## 1. What is a String?
A **String** is a sequence of characters used to store text, such as a name, message, or sentence.

```java
String name = "Rahul";
String city = "Dhanbad";
```

Think of a String like a train: every character is a coach, and each coach has an index. Indexing starts from `0`.

For `"JAVA"`:

| Character | J | A | V | A |
|---|---:|---:|---:|---:|
| Index | 0 | 1 | 2 | 3 |

## 2. Why and where do we use Strings?
- Names, email IDs, passwords, messages and user input
- Searching, comparing, sorting and validating text
- Interview problems: palindrome, anagram, frequency, substring and sliding window

## 3. Important Java String facts
- `String` is a class in `java.lang`; no import is needed.
- Strings are **immutable**: once created, the object's character sequence cannot be changed. Operations such as `toUpperCase()` return a result; store it if you need it.
- Use `equals()` to compare text content. `==` checks whether two references point to the same object.
- `length()` gives the number of characters; `charAt(i)` gets the character at index `i`.
- `substring(start, end)` includes `start`, excludes `end`.
- For repeated modifications, consider `StringBuilder` to avoid creating many temporary String objects.

## 4. String creation and basic methods

```java
String s1 = "hello";                 // String literal
String s2 = new String("hello");     // object explicitly create kiya

System.out.println(s1.length());       // 5
System.out.println(s1.charAt(1));      // e
System.out.println(s1.substring(1, 4));// ell
System.out.println(s1.equals(s2));    // true: content same
System.out.println(s1 == s2);         // usually false: references differ
System.out.println(s1.toUpperCase()); // HELLO
System.out.println(s1.contains("ll"));// true
System.out.println(s1.indexOf('l'));  // 2 (first match)
```

### Remember
`length()` is a method, so use `s.length()`; array length is a field, `arr.length`.

## 5. String vs char[] vs StringBuilder

| Type | Meaning | Key point |
|---|---|---|
| `String` | Text object | Immutable |
| `char[]` | Character array | Individual characters can be changed |
| `StringBuilder` | Mutable text builder | Efficient for repeated append/reverse |

## 6. Problem-solving patterns

| Pattern | Use it for |
|---|---|
| Two pointers | Reverse, palindrome, compare from both ends |
| Frequency array / HashMap | Anagram, character counts, duplicates |
| Sliding window | Longest/shortest substring with a condition |
| StringBuilder | Build or modify text repeatedly |
| Parsing | Convert text to numbers; validate formats |

## 7. Dry run: Reverse a String
Input: `"code"`. Set `left = 0`, `right = 3`; swap while `left < right`.

| Step | Swap | Character array |
|---|---|---|
| Start | — | c o d e |
| 1 | c ↔ e | e o d c |
| 2 | o ↔ d | e d o c |
| Stop | left >= right | `"edoc"` |

Memory trick: **two pointers meet in the middle; then stop.**

## 8. Basic → Intermediate → Advanced practice list

### Basic
1. Print each character of a String
2. Count vowels and consonants
3. Reverse a String
4. Check palindrome
5. Count words in a sentence
6. Toggle character case
7. Remove spaces
8. Find frequency of a given character

### Intermediate
9. Check whether two Strings are anagrams
10. Find the first non-repeating character
11. Remove duplicate characters
12. Find the most frequent character
13. Reverse words in a sentence
14. Longest common prefix
15. String compression (e.g. `aaabb` → `a3b2`)
16. Check String rotation
17. Valid parentheses (String + Stack)
18. Group anagrams (HashMap)

### Advanced / interview patterns
19. Longest substring without repeating characters
20. Longest palindromic substring
21. Minimum window substring
22. Find all anagrams of a pattern
23. Rabin-Karp pattern searching
24. KMP pattern matching
25. Decode String (e.g. `3[a]` → `aaa`)
26. Edit distance
27. Word Break

## 9. Interview quick checks
- **Why is String immutable?** It supports safe sharing, String pool behavior, and stable values for uses such as keys.
- **`==` vs `equals()`?** Reference identity vs content equality.
- **String vs StringBuilder?** Immutable text vs mutable text builder.
- **Why is `substring(i, j)` length `j-i`?** Start is included; end is excluded.
- **When use HashMap?** When tracking character counts or last-seen indices.
- **When use sliding window?** When a contiguous substring/window must satisfy a condition.

## 10. Common mistakes
- Using `==` for content comparison.
- Accessing `charAt(s.length())` (last valid index is `length()-1`).
- Forgetting `substring` end index is exclusive.
- Assuming String methods modify the original String.
- Using nested loops when a frequency array or HashMap can solve it in linear time.
- Ignoring uppercase/lowercase or spaces when the problem's rules require normalization.

## 11. Complexity cheat sheet
Let `n` be String length. Reading `length()` is O(1); scanning is O(n); creating a reversed copy is O(n) time and O(n) extra space. Two-pointer palindrome checking is O(n) time and O(1) extra space. HashMap frequency counting is O(n) expected time and O(k) space, where `k` is distinct characters.

## 12. Practice routine
1. Read the question and clarify case/space rules.
2. Explain brute force in your own words.
3. Dry-run a small example in a table.
4. Code without copying.
5. Test empty, one-character, repeated-character and mixed-case inputs.
6. State time and space complexity.

**Learning order:** Basics → Two Pointers → Frequency/HashMap → Sliding Window → StringBuilder → KMP/Rabin-Karp → DP on Strings.
