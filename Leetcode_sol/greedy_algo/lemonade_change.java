package Leetcode_sol.greedy_algo;

public class lemonade_change {
    public static boolean lemon(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int a : bills){
            if(a == 5){
                five++;
            }
            else if(a==10){
                if(five != 0){
                    ten++;
                    five--;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten >= 1 && five>= 1){
                    twenty++;
                    ten--;
                    five--;
                }
                else if(ten == 0 && five >= 3){
                    five = five - 3;
                    twenty++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5,5,20,20};
        System.out.println(lemon(bills));
    }
}
