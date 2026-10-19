# LeetCode 11 — Container With Most Water

- **Difficulty:** Medium
- **Topic:** Two Pointers
- **Problem:** [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
- **Java file:** [ContainerWithMostWater.java](ContainerWithMostWater.java)

## Problem in simple words

Given an array where each value is the height of a vertical bar, choose two bars that can hold the maximum amount of water.

## Formula

`area = min(heights[left], heights[right]) * (right - left)`

- **Width:** `right - left`
- **Water height:** dono bars mein se chhoti height

## Approach — Two Pointers

1. `left = 0` aur `right = heights.length - 1` set karo.
2. Dono pointers ke beech ka area calculate karo.
3. `maxWater` ko maximum area ke saath update karo.
4. Shorter bar wala pointer move karo. Agar left bar chhota hai to `left++`, otherwise `right--`.
5. Jab tak `left < right`, repeat karo.

### Shorter pointer hi kyun move karte hain?

Area shorter bar ki height se limited hota hai. Taller bar ko move karne par width kam hogi, lekin limiting height improve karne ka chance nahi milega. Shorter bar ko move karke hum taller bar dhoondh sakte hain.

## Example 1

**Input:** `[1, 7, 2, 5, 4, 7, 3, 6]`

**Output:** `36`

Maximum area indices `1` aur `7` par milta hai:

`min(7, 6) * (7 - 1) = 6 * 6 = 36`

## Dry Run

| left | right | heights | width | area | maxWater |
|---:|---:|---|---:|---:|---:|
| 0 | 7 | 1, 6 | 7 | 7 | 7 |
| 1 | 7 | 7, 6 | 6 | 36 | 36 |
| 1 | 6 | 7, 3 | 5 | 15 | 36 |
| 1 | 5 | 7, 7 | 4 | 28 | 36 |
| 1 | 4 | 7, 4 | 3 | 12 | 36 |
| 1 | 3 | 7, 5 | 2 | 10 | 36 |
| 1 | 2 | 7, 2 | 1 | 2 | 36 |

**Final answer: `36`**

## Example 2

**Input:** `[2, 2, 2]`

**Output:** `4`

First calculation: `min(2, 2) * (2 - 0) = 4`.

## Complexity

- **Time:** `O(n)` — each step moves one pointer.
- **Extra Space:** `O(1)` — only a few variables are used.

## Interview explanation

“I use two pointers at the beginning and end of the array. At each step, I calculate the area using the shorter bar and the distance between the pointers, then update the maximum area. I move the pointer at the shorter bar because that height limits the water. The solution takes O(n) time and O(1) extra space.”
