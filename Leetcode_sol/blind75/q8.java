package Leetcode_sol.blind75;

// minimum in a rotated array - binary search method

public class q8 {
    public static int findmin(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left) /2 ;
            if(nums[mid] < right){
                left = mid + 1;
            }
            else{
                right = mid;
            }

        }
        return nums[left];
    }
    public static void main(String[] args) {
        
    }
}
