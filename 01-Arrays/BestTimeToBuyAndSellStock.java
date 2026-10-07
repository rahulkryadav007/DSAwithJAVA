/**
 * LeetCode 121 - Best Time to Buy and Sell Stock
 *
 * Problem:
 * Given an array where prices[i] is the price of a stock on day i,
 * find the maximum profit you can achieve by buying on one day
 * and selling on a later day.
 *
 * Approach:
 * Keep track of the minimum price seen so far.
 * For every day, calculate the profit if we sell today.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Aaj ka price minimum hai to buy price update karo
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Agar aaj sell karein to kitna profit hoga?
            int profit = prices[i] - minPrice;

            // Maximum profit ko update karo
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}

/*
Output:
Maximum Profit: 5

Dry Run:
prices = [7, 1, 5, 3, 6, 4]

minPrice = 7, maxProfit = 0
1 -> minPrice = 1
5 -> profit = 4, maxProfit = 4
3 -> profit = 2
6 -> profit = 5, maxProfit = 5
4 -> profit = 3

Answer = 5
Buy at 1 and sell at 6.
*/
