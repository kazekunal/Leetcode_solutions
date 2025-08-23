package Leetcode_sol.blind75;

import java.util.HashMap;

// two sum

public class q2 {

    public static int[] twosum(int[] nums, int target){
        HashMap<Integer,Integer> st = new HashMap<>(); //hashset used here

        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];

            if(st.containsKey(comp)){
                return new int[] {st.get(comp), i};
            }
            
            st.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,5,6};
        int[] res = twosum(nums, 3);
        for(int num: res){
            System.out.println(num);
        }
    }
}
