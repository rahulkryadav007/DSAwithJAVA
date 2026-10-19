/**
 * LeetCode 11: Container With Most Water
 * Problem: https://leetcode.com/problems/container-with-most-water/
 *
 * Approach: Two Pointers
 * Example 1:
 * Input:  heights = [1, 7, 2, 5, 4, 7, 3, 6]
 * Output: 36
 *
 * Hinglish logic:
 * - Ek pointer start par aur ek end par rakho.
 * - Area = shorter bar ki height * dono bars ke beech ka width.
 * - Maximum area ko update karo.
 * - Hamesha shorter bar wala pointer move karo.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int area = width * height;

            maxWater = Math.max(maxWater, area);

            // Chhoti height water level ko limit karti hai, isliye use move karo.
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] heights = {1, 7, 2, 5, 4, 7, 3, 6};
        System.out.println(maxArea(heights)); // Output: 36
    }
}
