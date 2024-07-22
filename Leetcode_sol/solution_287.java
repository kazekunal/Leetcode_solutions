package Leetcode_sol;

//tortoise and hare method - tortoise - 1 skip hare - 2 skips

public class solution_287 {
    public static int duplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow!=fast);
        slow = nums[0];
        while(slow!= fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4}; 
        duplicate(nums);
    }
}
