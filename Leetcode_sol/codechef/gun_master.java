package Leetcode_sol.codechef;

import java.util.Scanner;

//number of test cases
//N and D - number of targets and max eff range of close ranged gun
//a1,a2,..an - distances to n targets in order

//min number of gun switches required

//testcases - 2 1 3 4 
//3 2 3 2 3 2
//1 1 3 3 1
public class gun_master {
    public static int switches(int n, int d, int[] arr){
        int sw = 0;
        boolean temp = false;
        for(int i = 0; i<n; i++){
            if(arr[i] <= d){
                if(temp == true){
                    sw++;
                    temp = !temp;
                }
            }
            else{
                if(temp == false){
                    sw++;
                    temp = !temp;
                }
            }
        }
        return sw;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cases");
        int a = sc.nextInt();
        for(int i = 0; i<a; i++){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int arr[] = new int[n];
            for(int j = 0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(switches(n,d,arr));
            
        }

    }
}
