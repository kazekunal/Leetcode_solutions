package Leetcode_sol.Leetcode_array;

public class solution_268 {
    public static void missingnumber(int[] arr){
        int n = arr.length;
        int act_sum = (n * (n + 1)) / 2;
        int sum = 0;
        for(int j = 0; j < n; j++){
            sum += arr[j];
        }
        int diff = act_sum - sum;
        System.out.print(diff);
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5};
        missingnumber(arr);
    }
    
}
