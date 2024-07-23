package Leetcode_sol.Leetcode_array;

//rotate image

public class solution_48 {
    public static void rotate(int[][] nums){

//transpose the matrix
        for(int i = 0; i<nums.length ; i++){
            for(int j = i; j<nums.length; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
//reverse the matrix
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length / 2; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[i][nums.length - 1 -j];
                nums[i][nums.length - 1 -j] = temp;
            }
        }
        
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(nums);
        for(int i = 0; i<nums.length ; i++){
            for(int j = 0; j<nums.length; j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
