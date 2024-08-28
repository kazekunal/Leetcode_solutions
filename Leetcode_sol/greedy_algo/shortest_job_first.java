package Leetcode_sol.greedy_algo;

import java.util.Arrays;

public class shortest_job_first {

    //time complexity -> O(n)+O(nlogn)
    //space complexity -> O(1)
    public static int sjf(int[] process) {
        int total = 0;
        int wait = 0;
        int n = process.length;
        Arrays.sort(process);
        for(int a : process){
            wait += total;
            total += a;
        }
        return wait/n;
    }
    public static void main(String[] args) {
        int[] p = {7,3,4,1,2};
        System.out.println(sjf(p));
    }
}
