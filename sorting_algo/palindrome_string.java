package sorting_algo;

import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        String og, rev = ""; //original and reversed strings
        Scanner in = new Scanner(System.in);
        System.out.println("enter your string");
        og = in.nextLine();
        for(int i = og.length() - 1; i>=0; i--){
            rev = rev + og.charAt(i); //empty string + new string in rev order
        }
        if(og.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a Palindrome");
        }
        in.close();
    }
}
