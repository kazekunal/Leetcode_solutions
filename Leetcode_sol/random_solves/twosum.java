package Leetcode_sol.random_solves;
import java.util.*;

public class twosum {

    public static int two_sum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        throw new Exception()
    }

    public static void two(int[] nums, int target){
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int ans = nums[i] + nums[j];
                if(ans == target) {
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {10,22,2,1};
        int target = 12;
        two(nums, target);
    }    
}
