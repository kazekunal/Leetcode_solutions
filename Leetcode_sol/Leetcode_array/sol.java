package Leetcode_sol.Leetcode_array;

public class sol {
    public static void modest_numbers(int n, int m) {
        String num = Integer.toString(m);
        String num1 = Integer.toString(n);
        String num2 = num1+num;
        int ans = Integer.parseInt(num2);
        System.out.println(ans);

        for(int i = n; i<=m; i++){
            if(ans%m == 1){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        modest_numbers(1, 2);
    }
}
