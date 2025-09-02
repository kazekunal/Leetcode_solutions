package Leetcode_sol.sliding_window;

import java.util.HashMap;

// maximum sum of distinct subarray

public class q1 {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0l, currSum = 0l;
        int l = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            while ((i - l+1) > k || map.containsKey(nums[i])) {
                currSum -= nums[l];
                map.remove(nums[l++]);
            }

            currSum += nums[i];
            map.put(nums[i],i);
            
            if(i-l+1 == k) {
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
  public static void main(String[] args) {
    
  }  
}
