package Leetcode_sol.Leetcode_array;

public class rotate_array {
    public static boolean check(int[] arr){
        int res = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > arr[(i+1) % arr.length]){ //wrap around logic to get circular arrays covered
                res++;
            }
            if(res > 1) return false; 
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5};
        System.out.println(check(arr)); //checking whether it is sorted or rotated words
    }
}
