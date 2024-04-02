package Leetcode_sol;

public class solution_53{

    static int kadane(int nums[]){
        int size = nums.length;
        int total_sum = Integer.MIN_VALUE;
        int sum_subarray = 0;

        for(int i = 0; i<size; i++){
            sum_subarray = sum_subarray + nums[i];
            if(sum_subarray > total_sum) total_sum = sum_subarray;
            if(sum_subarray < 0) sum_subarray = 0;
        }
        return total_sum;
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("maximum subarray is " + kadane(nums));
    }
}