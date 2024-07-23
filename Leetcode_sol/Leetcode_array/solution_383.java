package Leetcode_sol.Leetcode_array;

public class solution_383 {
    public static boolean canConstruct(String ransomNote, String magazine){
        int[] count = new int[26];

        // for(int i =0; i<magazine.length();i++){
        //     char b = magazine.charAt(i);
        // }
        for(char ch:magazine.toCharArray()){
            //basically ascii value of a is subtracted from the character in order to fill the count array with the required index to count the frequency of the character
            count[ch - 'a']++;  
        }
        for(char ch:ransomNote.toCharArray()){
            //the above puts the characters inside the count array and this one removes the characters from the array in order to check if there is a surplus in ransom note
            count[ch-'a']--;
            //now it will check if there is surplus then return false otherwise true
            if(count[ch-'a'] < 0){
                return false;
            }
        }


        return true;
    }
    public static void main(String[] args) {
    String ransomNote = "aabbcc";
    String magazine = "abcabcabc";
    
    if (solution_383.canConstruct(ransomNote, magazine)) {
        System.out.println("Ransom note can be constructed from the magazine.");
    } else {
        System.out.println("Ransom note cannot be constructed from the magazine.");
    }
    }
}
