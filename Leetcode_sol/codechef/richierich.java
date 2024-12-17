package Leetcode_sol.codechef;

import java.util.Scanner;

public class richierich {
    public static int calc_rich(int own, int reach, int incr){
        int result = 0;
        result = reach - own;
        result = result / incr;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of test cases - ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for(int i = 0; i<no; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(calc_rich(a,b,c));
        }
        sc.close();
    }
}
