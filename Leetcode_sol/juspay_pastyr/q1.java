package Leetcode_sol.juspay_pastyr;

import java.util.*;

public class q1 {
    
    // Global preprocessing array to store next bar position for each index
    private static int[] nextBar;
    
    // Preprocessing method to build the nextBar array
    public static void preprocessString(String s) {
        int len = s.length();
        nextBar = new int[len];
        Arrays.fill(nextBar, -1);
        Stack<Integer> st = new Stack<>();
        
        // For each position, find the next bar using stack
        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(ch == '|') {
                // Found a bar, so all positions in stack now know their next bar
                while(!st.empty()) {
                    int idx = st.pop();
                    nextBar[idx] = i;
                }
            }
            st.push(i);
        }
    }

    public static int stars_number(String s, int startindex, int endindex) {
        if(endindex <= startindex) return 0;
        
        // Preprocess the string if not done already
        if(nextBar == null || nextBar.length != s.length()) {
            preprocessString(s);
        }
        
        int starCount = 0;
        int currentIndex = startindex;
        
        // Find first bar in range
        if(s.charAt(currentIndex) != '|') {
            currentIndex = nextBar[currentIndex];
        }
        
        // If no bar found or bar is outside range, return 0
        if(currentIndex == -1 || currentIndex > endindex) {
            return 0;
        }
        
        // Count stars between consecutive bars
        while(currentIndex < endindex && nextBar[currentIndex] != -1) {
            int nextBarIndex = nextBar[currentIndex];
            if(nextBarIndex <= endindex) {
                // Count stars between current bar and next bar
                starCount += nextBarIndex - currentIndex - 1;
                currentIndex = nextBarIndex;
            } else {
                break;
            }
        }
        
        return starCount;
    }
    
    // Helper method for multiple queries (optional)
    public static int[] processMultipleQueries(String s, int[] startIndices, int[] endIndices) {
        // Preprocess once for all queries
        preprocessString(s);
        
        int n = startIndices.length;
        int[] results = new int[n];
        
        for(int i = 0; i < n; i++) {
            results[i] = stars_number(s, startIndices[i], endIndices[i]);
        }
        
        return results;
    }
   
   public static void main(String[] args) {
       // Test case 1: Sample from problem
       String s1 = "*|*|";
       System.out.println("Test 1: " + stars_number(s1, 0, 2)); // Expected: 0
       
       // Test case 2: Example from problem
       String s2 = "|**|*|";
       System.out.println("Test 2: " + stars_number(s2, 0, 4)); // Expected: 2
       System.out.println("Test 3: " + stars_number(s2, 0, 5)); // Expected: 3
       
       // Test case 3: Multiple queries
       String s3 = "|*|*|*|";
       int[] starts = {0, 1, 2};
       int[] ends = {6, 5, 4};
       int[] results = processMultipleQueries(s3, starts, ends);
       System.out.println("Multiple queries result: " + Arrays.toString(results));
       
       // Test case 4: Edge cases
       System.out.println("Edge case 1: " + stars_number("***", 0, 2)); // Expected: 0 (no bars)
       System.out.println("Edge case 2: " + stars_number("|||", 0, 2)); // Expected: 0 (no stars)
       System.out.println("Edge case 3: " + stars_number("|", 0, 0)); // Expected: 0 (single bar)
   } 
}