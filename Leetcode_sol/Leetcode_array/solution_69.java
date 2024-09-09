package Leetcode_sol.Leetcode_array;

public class solution_69{
    public static int sqrt(int x) {
        long left = 0;  
        long right = (x/2) + 1;
        while(left<right){
            long mid = left + (right - left)/2 + 1;
            long square = mid * mid;
            if(square == x){
                return (int) mid;
            }else if(square < x){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return (int) left;
    }
}