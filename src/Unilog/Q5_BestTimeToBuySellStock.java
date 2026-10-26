package Unilog;
/* Best Time to Buy and Sell Stock
Problem: You are given an array where prices[i] represents
the stock price on day i. You can buy once and sell later.
Find the maximum profit possible. If no profit is possible, return 0. */

public class Q5_BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
/* Complexity
- Time: O(n) — one traversal.
- Auxiliary space: O(1) — only two variables.
*/
