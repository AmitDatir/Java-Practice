/*
121. Best Time to Buy and Sell Stock : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/


//1:
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            // Update the lowest buying price seen so far
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate potential profit and update max profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}



//2:
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}


//3: brute force
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        // Loop through every possible buying day
        for (int i = 0; i < prices.length; i++) {
            // Loop through every subsequent day to sell
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                
                // Update maxProfit if a higher profit is found
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}

