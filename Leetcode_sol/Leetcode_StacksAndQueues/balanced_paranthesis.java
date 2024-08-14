package Leetcode_sol.Leetcode_StacksAndQueues;

class Stack {
    int size;
    int top;
    char[] st;

    Stack(int size) {
        this.size = size;
        this.top = -1;
        this.st = new char[size];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(char ch) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot add element.");
            return;
        }
        st[++top] = ch;
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot remove element.");
            return '\0';
        }
        return st[top--];
    }
}

public class balanced_paranthesis {
    public static boolean balanced(String s) {
        Stack st = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;
                char topCh = st.pop();
                if ((ch == ')' && topCh != '(') || (ch == '}' && topCh != '{') || (ch == ']' && topCh != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(balanced("({[]})"));
        System.out.println(balanced("({[})"));
    }
}
