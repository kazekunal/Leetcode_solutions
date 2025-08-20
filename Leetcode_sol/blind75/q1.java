package Leetcode_sol.blind75;

import java.util.HashSet;

public class q1 {

    public static int longest(int[] nums){

        if(nums.length == 0) return 0; // edge condition

        HashSet<Integer> st = new HashSet<>(); // hashset has a property which does not store duplicates

        for(int i = 0; i<nums.length; i++){
            st.add(nums[i]);
        } 

        int longest = 1;

        for(int num : st){
            if(st.contains(num - 1)) continue;

            else{
                int current = num;
                int currentSub = 1;

                while(st.contains(current + 1)){
                    current++;
                    currentSub++;
                }
                longest = Math.max(longest, currentSub);
            }
        }
        return longest;

    }
    public static void main(String[] args) {
        
    }
}
