package Leetcode_sol.greedy_algo;

import java.util.Arrays;

//The key idea is to be "greedy" and assign the smallest cookie that satisfies the current kid's greed factor, without worrying about the future kids. This approach ensures that we are maximizing the number of kids that can be satisfied.
public class assign_cookies {
    public static int kids_cookies(int[] kids, int[] cookies) {
        //sort both the arrays in ascending order
        Arrays.sort(kids);
        Arrays.sort(cookies);
        //now we will get three pointers
        //one will check the cookie index;
        //two will check the kids index
        // third will denote how many kids have been given the cookie
        int c = 0;
        int k = 0;
        int satisfied = 0;
        //now we will run a while loop whjch will iterate through the cookie array and check if cookieindex is less than the lenght and kid index is less than kids array length
        //condition check : if cookie array has a cookie which is greater than or equal to the kids greed then it will say satisfied else it will move ahead;
        while(c < cookies.length && k< kids.length){
            if(cookies[c] >= kids[k]){
                satisfied++;
            }
            c++;
        }
        return satisfied;
    }
    public static void main(String[] args) {
        int[] cookie = {1,3,1,3,4};
        int[] kids = {1,2,3,4,5};
        System.out.print(kids_cookies(kids, cookie));
    }
}
