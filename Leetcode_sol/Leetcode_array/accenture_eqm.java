package Leetcode_sol.Leetcode_array;

//equilibrium position is the position where left sum and right sum is equal
public class accenture_eqm {
    public static int eqm(int[] arr) {
        int total_sum = 0;
        int left_sum = 0;
        for(int i = 0; i<arr.length; i++){
            total_sum += arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            total_sum -= arr[i];
            if(left_sum == total_sum) return i+1; //returns the position of eqm
            left_sum += arr[i];
        }
        return -1; // not found
        
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,1};
        System.out.println(eqm(arr)); 
    }
}
