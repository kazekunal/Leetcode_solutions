package Leetcode_sol.blind75;


public class q10 {
    public static int maxArea(int[] nums){
        int max = 0;
        int left = 0; 
        int right = nums.length-1; //two pointer approach

        while(left < right){
            int wid = right - left;
            int ht = Math.min(nums[left], nums[right]);
            int currwater = wid * ht;
            max = Math.max(max, currwater);

            if(nums[left] < nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
