package Leetcode_sol.leetcode_strings;

import java.util.Arrays;

public class anagram {

    //time complexity - O(nlogn)
    //space complexity - O(n)
    public static Boolean anagram_checker(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        //converting into array takes O(n) time
        char[] s1_arr = s1.toCharArray();
        char[] s2_arr = s2.toCharArray();
        //sorting takes O(logn)
        Arrays.sort(s1_arr);
        Arrays.sort(s2_arr);

        return Arrays.equals(s1_arr, s2_arr);
    }

    public static Boolean better_anagram_checker(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int[] count = new int[26];
        for(int i = 0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a' ]++;
            count[s2.charAt(i) - 'a' ]--;
        }
        for(int i = 0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "elloh";
        Boolean check = anagram_checker(s1, s2);
        System.out.println(check);
        Boolean check_2 = better_anagram_checker(s1, s2);
        System.out.println(check_2);
    }
}
