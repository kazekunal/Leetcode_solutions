package Leetcode_sol.leetcode_strings;

import java.util.HashMap;

public class longest_repeating_withreplacement {

    public static int longestrepeating(int k, String s){
        if(s.length() == 1) return 1;
        // HashMap<Character, Integer> st = new HashMap<>(); instead of a hashmap we can use a limited space integer array

        int[] count = new int[26];


        int max = 0;
        int ans = 0;

        for(int l = 0, r = 0; r<s.length(); ++r){
            max = Math.max(ans, ++count[s.charAt(r) - 'A']);

            while(max + k < l - r + 1){
                --count[s.charAt(l++) - 'A'];
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        for(int i = 0; i<5; ++i){
            System.out.println(i);
        }
    }
}
