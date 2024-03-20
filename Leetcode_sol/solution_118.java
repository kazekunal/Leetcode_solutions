package Leetcode_sol;
import java.util.*;

class Solution_118{
    public static List<List<Integer>> generate(int numRows) {

        //creating a new list of list of integers triangle to represent the output
        List<List<Integer>> triangle = new ArrayList<>();

        //indexing the 0th condition, which returns an empty triangle
        if (numRows == 0) return triangle;
        //first row is defined as a list of integers having 1 as it's only element
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        //looping for the rows after first one
        for(int i = 1; i<numRows; i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j = 1; j<i; j++){
                // the new row will have the sum of previous row elements j-1 & j
                row.add(prev_row.get(j-1)+prev_row.get(j)); 
            }

            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of rows in pascal's triangle");
    int numRows = sc.nextInt();
    List<List<Integer>> pascal = generate(numRows); // Corrected declaration of 'pascal'
    System.out.println("Pascal's triangle with " + numRows + " rows is: \n " + pascal);
    sc.close();
}
}