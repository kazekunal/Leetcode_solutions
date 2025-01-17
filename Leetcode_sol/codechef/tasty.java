package Leetcode_sol.codechef;

import java.util.Scanner;

public class tasty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int t1 = Math.min(a, b);
            int t2 = b - t1;
            int max = Math.abs(t1 - t2); 
            System.out.println(max);
        }
    }
}
