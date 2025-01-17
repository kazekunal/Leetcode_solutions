package Leetcode_sol.codechef;

import java.util.Scanner;

public class lang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            if(a == a1 && b == b1){
                System.out.println(1);
            }
            else if(a == a2 && b == b2){
                System.out.println(2);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
