package Leetcode_sol.dailyproblem;

public class aug {
    public static int areaMaxDiagnol(int[][] dimensions){
        int max = 0;
        int res = 0;
        for(int i = 0; i<dimensions.length; i++){
            int temp = dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1];
            int area = dimensions[i][0] * dimensions[i][1];

            if(temp > max || (temp == max && area>res)){
                max = temp;
                res = area;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
