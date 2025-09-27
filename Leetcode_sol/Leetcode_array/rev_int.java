package Leetcode_sol.Leetcode_array;

import Leetcode_sol.codechef.test;

public class rev_int {
    public static int rev(int x){
        int sign = 1;
        if(x < 0){
            sign = sign - 2;
            x = x * -1;
        }
        
        String x_str = String.valueOf(x);
        char[] arr = x_str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        // now we will convert them back to a integer

        return 0;
    }

    public static int rev_opt(int x){
        long reversed = 0;

        while(x!=0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        if( reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            return 0;
        }

        return (int) reversed;
    }
    public static void main(String[] args) {
        rev(-12);
    }

}
