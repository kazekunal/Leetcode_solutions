package Leetcode_sol.codechef_205;

import java.util.Scanner;

public class sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            boolean hasEvenOnes = false, hasOddOnes = false;
            for (int i = 0; i < size; i++) {
                if (i % 2 == 0 && arr[i] == 1) hasEvenOnes = true;
                if (i % 2 == 1 && arr[i] == 1) hasOddOnes = true;
            }
            
            System.out.println((hasEvenOnes && hasOddOnes) ? "No" : "Yes");
        }
        
        sc.close();
    }
}
