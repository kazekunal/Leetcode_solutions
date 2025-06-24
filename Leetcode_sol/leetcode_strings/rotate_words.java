// rotate words -> abcde = bcdea 
package Leetcode_sol.leetcode_strings;

public class rotate_words {
    public static boolean rotate(String s, String goal){
        String kp = s + s;
        return kp.contains(goal);
    }
    public static void main(String[] args) {
        System.out.println(rotate("abcde", "bcdea"));
    }
}
