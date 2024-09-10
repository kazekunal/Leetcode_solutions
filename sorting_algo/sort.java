package sorting_algo;

//brute force - binary sort, linear sort, bucket sort
//better algo - 
//optimised sol

public class sort {
    public static void sort_colors(int[] st) {
        int zero = 0;
        int one = 0;
        int two= 0;

        for(int i = 0; i<st.length; i++){
            if(i == 0){
                zero++;
            }
            else if(i == 1){
                one++;
            }
            else{
                two++;
            }
        }
        st.append()
    }
    public static void main(String[] args) {
        int[] st = {0,2,2,1};

    }
}
