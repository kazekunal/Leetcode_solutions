package sorting_algo;

public class patternproblems{

    public static void square_fill(int n){
        String s = "*";
        for(int i = 0; i<n; i++ ){
            for(int j = 0; j<n; j++ ){
                System.out.print(s);
            }
            System.out.println();
        } 
    }

    public static void square_hollow(int n){
        String s = "*";
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i == n-1 || j == n-1 || i == 0 || j == 0){
                    System.out.print(s);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void number_triangle(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void number_inc_triangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void rev_number_inc_triangle(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        int n = 6;
        square_fill(n);
        square_hollow(n);
        number_triangle(n);
        number_inc_triangle(n);
        rev_number_inc_triangle(n);

    }
}