package Leetcode_sol.blind75;

import java.util.HashSet;

public class q4 {
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            st.add(nums[i]);
        }
        return st.size() == nums.length ? false : true;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
