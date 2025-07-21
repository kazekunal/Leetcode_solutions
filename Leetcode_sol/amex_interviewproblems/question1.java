import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question1 {
    public static int good_prime(int start, int pos){
        int c = 0;
        List<Integer> good = new ArrayList<>();

        for(int i = start + 1; c<pos; i++){
            int temp = i;
            int sum = 0;
            while(temp!=0){
                sum = sum + temp % 10;
                temp = temp / 10;
            }

            if(isprime(sum)){
                good.add(i);
                c++;
            }
        }
        return good.get(pos - 1);
    }

    // function for isprime or not
    public static boolean isprime(int n){
        if(n <= 1) return false;

        if(n <= 3) return true;

        if(n%2 == 0 || n%3 == 0) return false;

        for(int i = 5; i * i <= n; i = i + 6){
            if((n % i == 0) || (n % (i + 2) == 0)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int pos = sc.nextInt();
        System.out.println(good_prime(start, pos));
    }
}
