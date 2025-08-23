package Leetcode_sol.blind75;

public class q5 {
    public static int[] prod(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        // First pass: compute prefix products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Second pass: multiply by suffix products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
        
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = prod(nums);
        for(int n : res){
            System.out.println(n);
        }
    }
}
