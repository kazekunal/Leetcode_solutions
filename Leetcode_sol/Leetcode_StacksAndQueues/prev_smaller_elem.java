package Leetcode_sol.Leetcode_StacksAndQueues;

import java.util.Stack;

public class prev_smaller_elem {
    public static int[] pse(int[] arr) {

        //defining the data structures used here
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        for(int i = 0; i<arr.length; i++){
            while(!st.empty() && (st.peek() >= arr[i])){
                st.pop();
            }
            res[i] = st.empty()?-1:st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 8}; 
        int[] result = pse(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
