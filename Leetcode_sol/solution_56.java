package Leetcode_sol;

import java.util.*;

public class solution_56 {
    public static int[][] merge(int[][] nums){
        if(nums.length<=1) return nums;

        Arrays.sort(nums, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] curr = nums[0];
        result.add(curr);

        for(int[] a: nums){
            int curr_start = curr[0];
            int curr_end = curr[1];
            int next_start = a[0];
            int next_end = a[1];

            if(curr_end >= next_start){
                curr[1] = Math.max(curr_end, next_end);
            }
            else{
                curr = a;
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6},{8,10}};
        merge(nums);
    }

}
