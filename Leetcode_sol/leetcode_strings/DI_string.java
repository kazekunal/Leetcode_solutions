package Leetcode_sol.leetcode_strings;

import java.util.Scanner;
import java.util.Stack;


// input - IIIDIDD
// output - 12354

// approach - we can use a stack to store the numbers and then pop them as we get I's
// to find the shortest number, we need a greedy strategy

public class DI_string {
    public static String pattern_match(String pattern){
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<pattern.length(); i++){
            stack.push(i+1);
            
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                while(!stack.isEmpty()){
                    result.append(stack.pop());
                }
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        System.out.println(pattern_match(pattern)); 
        sc.close();
    }
}
