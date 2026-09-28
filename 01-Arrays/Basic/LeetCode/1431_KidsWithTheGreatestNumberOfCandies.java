package com.DSAPractice.Array.Basic.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max = candies[0];

        // Sabse zyada candies wale kid ko find karenge
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        // Har kid ko extra candies dene ke baad max se compare karenge
        for (int candy : candies) {

            // Agar current candies + extra max ke barabar ya zyada hai
            result.add(candy + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}

/*
LeetCode: 1431 - Kids With the Greatest Number of Candies
Time Complexity: O(n)
Space Complexity: O(n)
*/
