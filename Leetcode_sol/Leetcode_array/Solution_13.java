package Leetcode_sol.Leetcode_array;
import java.util.*;

// first approach to solve this using simple for loop and if else condition blocks

// class Solution_13 {
//     public int romanToInt(String s) {
//         int number = 0;
//         for(int i = 0; i < s.length(); i++){
//             if(s.charAt(i) >= s.charAt(i+1)){
//                 if(s.charAt(i) == 'I'){
//                     number += 1;
//                 }
//                 else if(s.charAt(i) == 'V'){
//                     number += 5;
//                 }
//                 else if(s.charAt(i) == 'X'){
//                     number += 10;
//                 }
//                 else if(s.charAt(i) == 'L'){
//                     number += 50; 
//                 }
//                 else if(s.charAt(i) == 'C'){
//                     number += 100; 
//                 }
//                 else if(s.charAt(i) == 'D'){
//                     number += 500; 
//                 }
//                 else if(s.charAt(i) == 'M'){
//                     number += 1000; 
//                 }
//             }
//             else{
//                 if(s.charAt(i) == 'I'){
//                     number = number - 1;
//                 }
//                 else if(s.charAt(i) == 'X'){
//                     number = number - 10;
//                 }
//                 else if(s.charAt(i) == 'C'){
//                     number = number - 100;
//                 }
//             }
//         }
//         return number;
//     }
// }

//better solution using complex data structure HashMap
class Solution_13{
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(); //created a new hashmap from character to integer value
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // storing the last character as integer in the result
        int result = map.get(s.charAt(s.length() - 1));

        //iterating from right to left, also we have already got the last number stored in the result so we started from 2nd last number
        for(int i = s.length()-2; i >= 0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) //check if the last number is bigger than the second last
            { 
                result -= map.get(s.charAt(i)); //if last is bigger, then we need to subtract
            }
            else{
                result += map.get(s.charAt(i)); //otherwise, we add the integers
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        Solution_13 solution = new Solution_13(); //object
        
        // Test cases
        String romanNumeral1 = "III";
        System.out.println("Roman numeral: " + romanNumeral1 + ", Integer value: " + solution.romanToInt(romanNumeral1));

        String romanNumeral2 = "IV";
        System.out.println("Roman numeral: " + romanNumeral2 + ", Integer value: " + solution.romanToInt(romanNumeral2));

        String romanNumeral3 = "IX";
        System.out.println("Roman numeral: " + romanNumeral3 + ", Integer value: " + solution.romanToInt(romanNumeral3));

        String romanNumeral4 = "LVIII";
        System.out.println("Roman numeral: " + romanNumeral4 + ", Integer value: " + solution.romanToInt(romanNumeral4));

        String romanNumeral5 = "MCMXCIV";
        System.out.println("Roman numeral: " + romanNumeral5 + ", Integer value: " + solution.romanToInt(romanNumeral5));
    }
}


