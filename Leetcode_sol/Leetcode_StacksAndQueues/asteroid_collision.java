package Leetcode_sol.Leetcode_StacksAndQueues;

import java.util.Stack;

//asteroid collision
//stack implementation
public class asteroid_collision {
    public static int[] collision(int[] aster) {
        Stack<Integer> st = new Stack<>();
        for(int a : aster){
            while(!st.empty() && a < 0 && st.peek() > 0){
                if(st.peek() < -a){
                    st.pop();
                    continue;
                }
                else if(st.peek() == -a){
                    st.pop();
                    a = 0;
                }
                
                break;
            }
            
            if (a!=0 &&(a > 0 || st.empty() || st.peek() < 0)){
                st.push(a);
            }
                
            
        }
        
        int[] result = new int[st.size()];
        for(int i = result.length - 1; i >= 0; i--){
            result[i] = st.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] aster = {5,10,-5};
        int[] result = collision(aster);
        for(int a : result){
            System.out.print(a + " ");
        }
    }
}
