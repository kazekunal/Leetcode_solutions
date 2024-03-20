package Leetcode_sol;
// public solution_121{
//     public static int max_profit(int[] prices) {
//         int max_profit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             for (int j = i + 1; j < prices.length; j++) {
//                 int profit = prices[j] - prices[i];
//                 if (profit > max_profit) {
//                     max_profit = profit;
//                 }
//             }
//         }
//         return max_profit;
//     }

//     public static void main(String[] args) {
//         int[] prices = {7, 1, 5, 3, 6, 4};
//         int maxProfit = max_profit(prices);
//         System.out.println("Max Profit: " + maxProfit);
//     }
// }

// the above given solution is my first attempt at solving
// this question and the solution is correct but not optimized
// due to Worst case time complexity of O(n^2) 

public class solution_121{
    public static int max_profit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;
        
        for (int i = 1; i<prices.length; i++ ){
            if(prices[i]<min_price){
                min_price = prices[i]; //min price is updated to be least value among the given array of integers
            }
            else{
                int curr_profit = prices[i] - min_price; //profit = sell - buy
                if(curr_profit>max_profit){
                    max_profit = curr_profit; 
                }
            }
        } 
        return max_profit;
    }
        
            public static void main(String[] args) {
                int[] prices = {7, 1, 5, 3, 6, 4};
                int maxProfit = max_profit(prices);
                System.out.println("Max Profit: " + maxProfit);
            }

}

//the most accurate solution to this problem is using predefined min and max functions -

// public class solution_121 {

//     public static int max_profit(int[] prices) {
//         int min = prices[0];
//         int maxProfit = 0;
        
//         for(int i=1;i<prices.length;i++){
//             min=Math.min(min,prices[i]);
           
//              maxProfit=Math.max(prices[i]-min,maxProfit);
            
//         }return maxProfit;
        
//     }

//     public static void main(String[] args) {
//         int[] prices = {7, 1, 5, 3, 6, 4};
//         int maxProfit = max_profit(prices);
//         System.out.println("Max Profit: " + maxProfit);
//     }
// }

// time complexity = O(n) but due to less space complexity this solution is faster
