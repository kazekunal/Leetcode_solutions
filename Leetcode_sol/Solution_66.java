
package Leetcode_sol;
import java.util.*;

class Leetcode_66{

        public static int[] plusOne(int[] digits) {
            int a = digits.length;
            for(int i = a-1; i>=0; i--){ //traversing the list of numbers starting from right to left
                if(digits[i]<9){ //if number is less than 9, then it will be in the same array
                    digits[i]++;
                    return digits;
                }
                else{
                    digits[i] = 0; //else all the digits in the list will be 0
                }
            }
            int[] new_arr = new int[a+1]; //new array
            new_arr[0] = 1; //first index of new array is 1
            return new_arr;
        }

    public static void main(String[] args) {
        int[] digits = {1,2,3}; //testcase 1
        int[] digits_2 = {9}; // testcase 2

        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne(digits_2)));
    }
}