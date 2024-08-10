package Leetcode_sol.Leetcode_StacksAndQueues;

//stacks - LIFO (Last in first out)

public class stacks {
    public static int[] push(int[] st, int x) {
        int top = -1;
        if(top>=10){
            top = top + 1;
            st[top] = x;
        }
        return st;
    }
    public static int top(int[] st, int top) {
         if(top == -1) return 0;
         return st[top];

    }
    public static int[] pop(int[] st, int top) {
        if(top == -1) return null;
        top = top-1;
        return st;
    }
    public static int size(int top) {
        return top+1;
    }
    public static void main(String[] args) {
        int[] st = {1,2,3,4};
        size(0);
        pop(st, 0);
        push(st, 0);
    }
}
