//make the string great!!

package Leetcode_sol.Leetcode_array;

class solution_1544{
    public static String makeGood(String s) {
        for(int i =0; i < s.length() - 1; i++){
            //s.charAt(i) == s.charAt(i+1) + 32 || s.charAt(i) + 32 == s.charAt(i+1)
            if(Math.abs(s.charAt(i) - s.charAt(i+1)) == 32){
                return makeGood(s.substring(0,i) + s.substring(i+2));
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(makeGood(s));
    }
}