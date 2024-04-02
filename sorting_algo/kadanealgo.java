//Largest Sum Contiguous Subarray (Kadane’s Algorithm)

public class kadanealgo {
    
    static int maxSubArraySum(int a[]){
        int size = a.length;
        int total_sum = Integer.MIN_VALUE; //updated the maximum value as the smallest integer(-231)
        int sum_subarray = 0; //sum total of all before element is negative

        for(int i = 0; i < size; i++){
            sum_subarray = sum_subarray + a[i]; 
            if(sum_subarray > total_sum) total_sum = sum_subarray;
            if(sum_subarray < 0) sum_subarray = 0;
        }
        return total_sum;
    }

    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous subarray sum is " + maxSubArraySum(a));
    }
}