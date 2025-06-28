package Leetcode_sol.leetcode_strings;

public class depth_paran {
    public static int depth(String s){
        // Stack<Character> st = new Stack<>();
        int count = 0;
        int max = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(' ){
                count++;
                if(count > max){
                    max = count;
                }
            }
            if(s.charAt(i) == ')'){
                count--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(depth(s));
    }
}
