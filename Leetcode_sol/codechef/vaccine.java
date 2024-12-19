package Leetcode_sol.codechef;

import java.util.Scanner;

public class vaccine {
    public static void days(int a,int b, int c){
        if(a >= b && a <= c){
            System.out.println("Take second dose now");
        }
        else if (a < b) {
            System.out.println("Too early");
        }
        else{
            System.out.println("Too late");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i<a;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            days(b, c, d);
            System.out.println(25 - a);
        }
        
    }
}
