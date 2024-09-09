package Leetcode_sol.leetcode_strings;

public class count_and_say {
    public static String cas(int n) {
        if (n == 1) return "1";
        StringBuilder curr = new StringBuilder();
        String prev = cas(n-1);
        int count=0;
        for(int i = 0; i<prev.length(); i++){
            count++;
            if(i == (prev.length() - 1) ||  prev.charAt(i) != prev.charAt(i + 1)){
                curr.append(count).append(prev.charAt(i));
                count = 0;
            }
        }
        return curr.toString();
    }
}
