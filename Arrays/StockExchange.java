/*Problem: Best Time to Buy and Sell Stock

Given:

[7, 1, 5, 3, 6, 4]

Each number represents the stock price on that day.

You can:

Buy once
Sell once
You must buy before selling.

Find the maximum profit.

Expected:

Buy at 1
Sell at 6


Profit = 6 - 1 = 5
More examples
[7, 6, 4, 3, 1]
→ 0

Because there's no profitable transaction.*/

public class StockExchange {
    public static int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if (profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
