package Leetcode_sol.leetcode_strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class restore_ip {
    public List<String> restore(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, "", 0, result);
        return result;
    }

    private void backtrack(String s, int index, String currentIP, int segment, List<String> result) {
        // Base case: If we have 4 segments and used all characters, add to result
        if (segment == 4 && index == s.length()) {
            result.add(currentIP.substring(0, currentIP.length() - 1)); // Remove last dot
            return;
        }

        // If we've used 4 segments but still have characters left, return
        if (segment == 4 || index >= s.length()) return;

        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length()) break; // Prevent out-of-bounds errors

            String part = s.substring(index, index + len);
            if (isValid(part)) {
                backtrack(s, index + len, currentIP + part + ".", segment + 1, result);
            }
        }
    }

    private boolean isValid(String s) {
        if (s.length() > 1 && s.startsWith("0")) return false; // No leading zeros
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close(); // Close the scanner

        restore_ip sol = new restore_ip();
        System.out.println(sol.restore(s)); // Print the output
    }
}
