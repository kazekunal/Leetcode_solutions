package Leetcode_sol.leetcode_strings;

public class remove_outermost_paran {
    public static String remove(String paran) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (int i = 0; i < paran.length(); i++) {
            char c = paran.charAt(i);
            if (c == '(') {
                if (depth > 0) {
                    result.append(c);
                }
                depth++;
            } else if (c == ')') {
                depth--;
                if (depth > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())(()(()))";
        String output = remove(input);
        System.out.println("After removing outermost parentheses: " + output);
    }
}
