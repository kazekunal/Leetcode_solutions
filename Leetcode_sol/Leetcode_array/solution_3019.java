package Leetcode_sol.Leetcode_array;
//3019. Number of Changing Keys
// You are given a 0-indexed string s typed by a user. Changing a key is defined as using a key different from the last used key. For example, s = "ab" has a change of a key while s = "bBBb" does not have any.
// Return the number of times the user had to change the key.

// Solution - O(n)
class solution_3019{
    public static int countKeyChanges(String s) {
        s = s.toLowerCase(); //converted all to lowercase
        int count = 0;
        for(int i = 0; i<s.length() - 1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }

public static void main(String[] args) {
    String s = "abbbaa";
    int changes = countKeyChanges(s);
    System.out.println("Number of key changes in string = " + changes);
}
}