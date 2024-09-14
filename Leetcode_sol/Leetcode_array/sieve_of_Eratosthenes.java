package Leetcode_sol.Leetcode_array;

//algorithm to find prime numbers less than integer n

public class sieve_of_Eratosthenes {
    public void prime_lessthan_n(int n) {
        boolean prime[] = new boolean[n+1];
        for(int i = 0; i <= n; i++){
            prime[i] = true;
        }
        for(int p = 2; p * p <= n; p++){
            if(prime[p] == true){
                for(int i = p * p; i <= n; i += p){
                    prime[i] = false;
                }
            }
        }
        for(int i = 2; i<=n;i++){
            if(prime[i] == true){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 30;
        sieve_of_Eratosthenes g = new sieve_of_Eratosthenes();
        g.prime_lessthan_n(n);
    }
    
}
