package Leetcode_sol.codechef;
import java.util.Scanner;

public class motivation {
    public static void main(String[] args) {
        System.out.println("Enter the number of test cases - ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int max = -1;
        for(int i = 0; i<no; i++){
            int n = sc.nextInt(); //no of movies
            int x = sc.nextInt(); //space required
            for(int j = 0; j<n; j++){
                int s = sc.nextInt();
                int r = sc.nextInt();
                if(s <= x && r > max){
                    max = r;
                }
            }

        }
        sc.close();
    }
}
