package Leetcode_sol.leetcode_strings;

import java.util.Scanner;

public class version_comp {
    public static int version(String a, String b){
        String[] v1 = a.split("\\."); //converting the string to divided array - 1.1.0 -> [1,1,0]
        String[] v2 = b.split("\\.");

        int max = Math.max(v1.length, v2.length); //taking the max of both to compare

        for(int i = 0; i<max; i++){
            int num1 = (i<v1.length)? Integer.parseInt(v1[i]):0;
            int num2 = (i<v2.length)? Integer.parseInt(v2[i]):0;

            if (num1 > num2) return 1;
            if (num1 < num2) return -1;
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(version(a,b));
        sc.close();
    }
}
