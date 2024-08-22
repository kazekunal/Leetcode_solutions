package Leetcode_sol.Leetcode_StacksAndQueues;

import java.util.Stack;

//daily temp to measure which is warmer
public class daily_temp {
    public static int[] daily(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[temp.length];

        for(int a = 0; a<temp.length; a++){
            while(!st.empty() && temp[st.peek()] < temp[a]){
                int idx = st.pop();
                res[idx] = a - idx;
            }
            st.push(a);
        }

        while(!st.empty()){
            int idx = st.pop();
            res[idx] = 0;
        }

        return res;
    }
    public static void main(String[] args) {
        int[] temp = {30,40,50};
        int[] ans = daily(temp);
        for(int i:ans){
            System.out.print(i + " ");
        }
    }
}
