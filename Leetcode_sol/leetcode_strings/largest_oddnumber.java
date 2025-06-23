package Leetcode_sol.leetcode_strings;

public class largest_oddnumber {
    public static String odd(String num){
        for(int i = num.length() - 1; i>=0; i--){
            if((num.charAt(i) - '0') % 2 != 0){ //
                return num.substring(0, i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(odd("12"));
    }
}
