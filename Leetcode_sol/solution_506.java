package Leetcode_sol;
import java.util.Arrays;

class solution_506{
    public static String[] findRelativeRanks(int[] score) {
        Integer[] index = new Integer[score.length]; //new array for storing index
        for(int i = 0; i<score.length; i++){
             index[i] = i; //stored index in array
        }
        // Arrays.sort(index, score[b], score[a]);
        Arrays.sort(index, (a, b) -> score[b] - score[a]); //sorted the array

        String[] res = new String[score.length]; // new array to store the result
        for(int i = 0; i<score.length; i++){
             if( i == 0){
                //gold medal to highest points along with stored at original index number
                 res[index[i]] = "Gold Medal";
             }
             else if( i == 1){
                 res[index[i]] = "Silver Medal"; 
             }
             else if( i == 2){
                 res[index[i]] = "Bronze Medal"; 
             }
             else{
                 res[index[i]] = (i+1) + "th";
             }
        } 
        return res;
     }

    //Priority Queue solution
    // class solution_506{
    //     public static String[] findRelativeRanks(int[] score){
    //         PriorityQueue<Integer> pq = new PriorityQueue<>((i,j) -> score[j] - score[i]);
    //         String[] ans = new String[score.length];

    //         for(int i = 0; i<score.length; i++){
    //             pq.add(i); //adding all the elements inside the priority queue
    //         }

    //         int i = 1;

    //         while(!pq.isEmpty()){ 
    //             int p = pq.poll(); //

    //             if(i==1){
    //                 ans[p] = "Gold Medal";
    //             }
    //             else if(i==2){
    //                 ans[p] = "Silver Medal";
    //             }
    //             else if(i==3){
    //                 ans[p] = "Bronze Medal";
    //             }
    //             else{
    //                 ans[p] = Integer.toString(i);
    //             }
    //             i++;
    //         }

    //         return ans;

    //     }


    public static void main(String[] args) {
        //TestCase 1
        int[] score = {5,4,3,2,1};
        String[] result = findRelativeRanks(score);
        System.out.println(Arrays.toString(result));

        //TestCase 2
        int[] score_2 = {7,3,2,4,1,5};
        String[] result_2 = findRelativeRanks(score_2);
        System.out.println(Arrays.toString(result_2)); 
        
    }
}