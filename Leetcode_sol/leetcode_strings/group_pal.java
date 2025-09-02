package Leetcode_sol.leetcode_strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_pal {
    public static List<List<String>> res(String[] strs){
        HashMap<String, List<String>> st = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars); // Sort the character array, not the original strs array
            String key = String.valueOf(chars);

            st.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(st.values());
    } 
    public static void main(String[] args) {
        
    }
}
