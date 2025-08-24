package Leetcode_sol.blind75;

// maximum product subarray
public class q7 {

    public static int maxProduct(int[] nums){
        int s = nums.length;
        if(s == 1){
            return nums[0];
        }

        int prod = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;

        for(int i = 0; i<s; i++){
                // if(prefix == 0) prod = 1;
                // if(suffix == 0) prod = 1;
                prefix = prefix == 0 ? 1 : prefix;
                suffix = suffix == 0 ? 1 : suffix;

                prefix *= nums[i];
                suffix *= nums[s - i - 1];

                prod = Math.max(prod, Math.max(prefix, suffix));
            }
            return prod;
        }
}
