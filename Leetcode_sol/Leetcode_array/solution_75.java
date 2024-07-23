package Leetcode_sol.Leetcode_array;

public class solution_75 {
    public static void sort_col(int[] nums){
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                count_0++;
            }
            else if(nums[i] == 1){
                count_1++;
            }
            else{
                count_2++;
            }
        }
        int index = 0;
        for(int j = 0; j<count_0; j++){
            nums[index++] = 0;
        }
        for(int j = 0; j<count_1; j++){
            nums[index++] = 1;
        }
        for(int j = 0; j<count_2; j++){
            nums[index++] = 2;
        }
        for(int j: nums){
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,0,0,0,1};
        sort_col(arr);
    }
}
