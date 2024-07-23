package Leetcode_sol.Leetcode_array;

public class solution_50 {
    public static double pow(int x, int n) {
        //base case for power
        if(n == 0){ 
            return 1;
        }
        // negative power would give reciprocal of the pow
        if(n<0){
            return 1 / pow(x, -n);
        }
        // odd power
        if(n%2 == 1){
            return x * pow(x, n-1);
        }
        // even power
        return pow(x * x, n/2);
    }
    public static void main(String[] args) {
        System.out.println(pow(2, -2));
    }
}
