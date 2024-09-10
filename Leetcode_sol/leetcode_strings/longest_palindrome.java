package Leetcode_sol.leetcode_strings;

public class longest_palindrome {
    public static String long_pal(String s) {
        if(s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for(int i = 0; i<s.length(); i++){
            int len1 = expandAroundCenter(s, i ,i);
            int len2 = expandAroundCenter(s,i,i+1);

            int len = Math.max(len1, len2);

            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len/2;
            }
        }
        return s.substring(start, end + 1);
    }
    public static int expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() &&  s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return right - left -1;
    }
    public static void main(String[] args) {
        // Test case
        String s = "babad";
        String result = long_pal(s);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}