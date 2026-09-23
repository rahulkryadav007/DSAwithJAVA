# Basic String Questions

Each problem has its own Java file. Run one file at a time.

| Problem | File | Description | Platform |
|---|---|---|---|
| Reverse String | [ReverseString.java](ReverseString.java) | Reverse the character order. | [LeetCode 344](https://leetcode.com/problems/reverse-string/) |
| Valid Palindrome | [Palindrome.java](Palindrome.java) | Check whether text reads the same both ways. | [LeetCode 125](https://leetcode.com/problems/valid-palindrome/) |
| Count Vowels | [CountVowels.java](CountVowels.java) | Count a, e, i, o, u in the input. | Basic practice |
| Character Frequency | [CharacterFrequency.java](CharacterFrequency.java) | Count occurrences of every character. | Basic practice |

## Quick dry run: Reverse `hello`

| Step | left | right | Action |
|---|---:|---:|---|
| 1 | 0 | 4 | Swap h and o → `oellh` |
| 2 | 1 | 3 | Swap e and l → `olleh` |
| Stop | 2 | 2 | Pointers meet; done |

**Complexity:** Reverse String uses O(n) time. The char array uses O(n) extra space.

Each Java file contains its own runnable `main` method and Hinglish comments. More questions will be added as individual files; this index is not a claim that the full 25-question set is complete.
