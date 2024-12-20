package Leetcode_sol.codechef;

import java.util.Scanner;

public class hoop_jump {
    //Time limit exceeded for this solution
    public static int hoopjump(int n){
        if(n==1){
            return 1;
        }
        int a = 0;
        int b = n;
        while(a != b){
            a += 1;
            b -= 1;
        }
        return a;
    }

    //that was it... worst solution of my life
    public static int hoopjump_better(int n){
        return n/2 + 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i<a; i++){
            int n = sc.nextInt();
            System.out.println(hoopjump(n));
        }
        sc.close();
    }
}
