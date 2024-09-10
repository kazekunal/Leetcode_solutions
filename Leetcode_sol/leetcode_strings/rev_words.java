package Leetcode_sol.leetcode_strings;

public class rev_words {
    public static String rev(String s) {
        s = s.trim(); //removing the spaces
        String[] words = s.split("\\s+"); //array containing string of words spliited by extra space 

        StringBuilder reversed = new StringBuilder();


        for(int i = words.length - 1; i>=0; i--){
            reversed.append(words[i]);
            if(i != 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
