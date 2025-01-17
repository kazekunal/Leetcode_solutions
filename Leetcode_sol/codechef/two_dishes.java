package Leetcode_sol.codechef;

import java.util.Scanner;

public class two_dishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int no = sc.nextInt();
            int fruits = sc.nextInt();
            int veg = sc.nextInt();
            int fish = sc.nextInt();

            if(no >= fruits && no>= fish && no>= veg/2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}
