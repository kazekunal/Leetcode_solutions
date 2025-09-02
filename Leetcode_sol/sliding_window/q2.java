package Leetcode_sol.sliding_window;

public class q2 {
    public static int[] beautySubArray(int[] nums, int k, int x){
        int[] res = new int[nums.length+1];

        int n = nums.length;
        int left = 0;

        for(int right = 0; right<n; right++){
            while(right - left + 1 > k){
                res[right] = nums[left];

            }
        }
    }
    public static void main(String[] args) {
        
    }
}
