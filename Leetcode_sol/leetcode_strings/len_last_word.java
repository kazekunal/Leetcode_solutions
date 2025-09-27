package Leetcode_sol.leetcode_strings;

// string s = "hello world" 
// we need to identify the delimiter here and then take the word after it.


public class len_last_word {
    public static int len_lastword(String s){
        char[] arr = s.toCharArray();
        int len = 0;
        for(int i = arr.length; i<0; i--){
            if(arr[i] == ' '){
                len = arr.length - (i); 
            }
        }
        return len;
    }
    public static void main(String[] args) {
        
    }
}
