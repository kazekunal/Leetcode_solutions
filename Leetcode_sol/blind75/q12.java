package Leetcode_sol.blind75;

public class q12 {
    // public static int coinChange(int[] coins, int amount){
    //     int[] memo = new int[amount + 1];
    //     return helper(coins, amount, memo);
    // }

    // private static int helper(int[] coins, int amount, int[] memotable){
    //     if(amount == 0) return 0;
    //     if(amount < 0) return -1;
    //     if(memotable[amount] < 0) return -1;

    //     int min = Integer.MAX_VALUE;
    //     for(int coin : coins){
    //         int res = helper(coins, amount - coin, memotable);
    //         if(res >= 0){
    //             min = Math.min(min, res+1);
    //         }
    //     }
    //     memotable[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
    //     return memotable[amount];
    // }

    public static int coinChange(int[] coins, int amount){
        int[] dp = new int[amount+1]; // memoization dp table
        if(amount < 1) return 0; // edge case detection

        for(int i = 0; i<amount; i++){
            dp[i] = Integer.MAX_VALUE; // taking all the values before hand as the maximum val
            for(int coin : coins){ // coin - 1 2 5 (types of coins taken)
                if(coin <= i && dp[i-coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
            if(dp[i] == Integer.MAX_VALUE) return -1;
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        
    }
}
