package Leetcode_sol.Leetcode_array;

//Pascal's triangle has 3 types of problems :
//1. Given rows and columns, find the number in the triangle -> also similar to ncr method
//2. Print the entire row from the triangle if row number is given
//3. Leetcode problem - 118 

public class pascal_2side {
    public static void sol_1(int n, int r){
        int res = 1;
        for(int i = 0; i < r; i++){ 
            res = res * (n-1) / (i+1);  // NcR method
        }
        System.out.println(res);
    }

    public static void sol_2(int n) {
        int res = 1;
        System.out.print(res + " ");  
        for (int i = 1; i < n; i++) {
            res = res * (n - i) / i;  //getting the whole row
            System.out.print(res + " ");
        }
    }

    public static void main(String[] args) {
        sol_1(5, 3);
        sol_2(5);
    }
}
