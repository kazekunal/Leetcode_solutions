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