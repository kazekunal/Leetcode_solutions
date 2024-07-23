package Leetcode_sol.Leetcode_array;

public class solution_74 {
    public static boolean searching(int[][] matrix, int target) {
        for(int i =0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int target = 3;
        int[][] matrix = {{1,2,3},{2,4,6}};
        System.out.println(searching(matrix, target)); 
    }
}
