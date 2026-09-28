package com.DSAPractice.Array.Basic.LeetCode;

public class FinalPricesWithASpecialDiscountInAShop {

    public static int[] finalPrices(int[] prices) {

        // Har item ke liye uske right side mein pehla chhota/equal price dhundenge
        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                // Discount ke liye first smaller or equal price mil gaya
                if (prices[j] <= prices[i]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};

        int[] result = finalPrices(prices);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

/*
LeetCode: 1475 - Final Prices With a Special Discount in a Shop
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
