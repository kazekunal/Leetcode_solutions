package Leetcode_sol.blind75;

public class q12 {
    public static int coinChange(int[] coins, int amount){
        int[] memo = new int[amount + 1];
        return helper(coins, amount, memo);
    }

    private static int helper(int[] coins, int amount, int[] memotable){
        if(amount == 0) return 0;
        if(amount < 0) return -1;
        if(memotable[amount] < 0) return -1;

        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            int res = helper(coins, amount - coin, memotable);
            if(res >= 0){
                min = Math.min(min, res+1);
            }
        }
        memotable[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
        return memotable[amount];
    }
    public static void main(String[] args) {
        
    }
}
