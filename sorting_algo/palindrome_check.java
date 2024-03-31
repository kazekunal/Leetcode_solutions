package sorting_algo;
import java.util.Scanner;

public class palindrome_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,sum = 0;
        int temp;
        int n = sc.nextInt();

        temp = n; //store the number in temp

        //
        while(n>0){
            r = n%10;
            sum = (sum*10) + r;
            n = n/10;
        }

        if(temp == sum){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not a palindrome number");
        }
        sc.close();
    }
}
