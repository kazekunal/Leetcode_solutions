package Leetcode_sol.blind75;

public class q3 {
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, maxProfit = 0;
        for (int i = 0; i <= prices.length - 1; i++) {
            if (buy < prices[i]) {
                int profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = prices[i]; // updated the value of buy with the next value
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {4,5,6,3,4,10};
        System.out.println(maxProfit(prices));
    }
}
