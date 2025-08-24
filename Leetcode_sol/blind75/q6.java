package Leetcode_sol.blind75;

// maximum contiguous subarray - 

public class q6 {

    public static int maxSubArray(int[] nums){
        int total_sum = Integer.MIN_VALUE;
        int kadane_sum = 0;

        for(int i = 0; i<nums.length; i++){
            kadane_sum += nums[i];
            if(kadane_sum > total_sum) total_sum = kadane_sum;
            if(kadane_sum < 0) kadane_sum = 0;
        }
        return total_sum;
    }
    public static void main(String[] args) {
        
    }
}
