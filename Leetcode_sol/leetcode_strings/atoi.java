package Leetcode_sol.leetcode_strings;

public class atoi {
    public static int myatoi(String s){
        int index = 0;
        int total = 0;
        int sign = 1;

        // Edge case: empty string
        if (s.length() == 0) return 0;

        // 1. Skip leading whitespaces
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // 2. Check if string is only spaces
        if (index == s.length()) return 0;

        // 3. Handle sign
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '+') ? 1 : -1;
            index++;
        }

        // 4. Convert digits and avoid overflow
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c < '0' || c > '9') break;

            int digit = c - '0';

            // Check for overflow
            if (total > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }

        return total * sign;

        //solution given below is correct but exceeds Time limit
        // int index = 0;
        // int total = 0;
        // int sign = 1;

        // if(s.length() == 0) return 0;
        // while(index < s.length() && s.charAt(index) == ' '){
        //     index++;
        // }
        // if(index == s.length()) return 0; // check this again to make sure it is not just a white space

        // if(s.charAt(index) == '+' || s.charAt(index) == '-'){
        //     sign = s.charAt(index) == '+' ? 1 : -1;
        //     index++;
        // }
        // while(index < s.length()){
        //     int digit = s.charAt(index) - '0';
        //     if(digit < 0 || digit > 9) break;
        //     if(Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit ){
        //         return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        //     }
        //     total = total * 10 + digit;
        //     index++;
        // }
        // return total * sign;
    }
    public static void main(String[] args) {
        String s = "-123sdwe2sadd";
        System.out.println(myatoi(s));
    }   
}
