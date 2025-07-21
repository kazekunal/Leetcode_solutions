import java.util.Scanner;

class dealership{
    int cars;
    int bikes;
}

public class Question3 {
    public static int tyres(int cars, int bikes){
        int num = 0;
        
        return num = cars * 4 + bikes * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i = 0; i<total; i++){
            int cars = sc.nextInt();
            int bikes = sc.nextInt();
            System.out.println(tyres(cars, bikes));
        }
        
    }
}
