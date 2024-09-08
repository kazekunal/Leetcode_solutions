package Leetcode_sol.Leetcode_array;

public class solution_16 {
    public static int remove_duplicates(int[] nums) {
       if(nums.length == 0) return 0;
       int i = 0;
    for(int j = 1; j < nums.length; j++){
        if(nums[j] != nums[i]){
            i++;
            nums[i] = nums[j];
        }
    } 
    return i + 1;
    }
}
