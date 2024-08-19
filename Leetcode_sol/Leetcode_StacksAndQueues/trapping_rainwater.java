package Leetcode_sol.Leetcode_StacksAndQueues;

public class trapping_rainwater {
    public static int trap_water(int[] height) {
        int total = 0;
        int lmax = 0;
        int rmax = 0;
        int l = 0;
        int r = height.length - 1;

        while(l<=r){
            if(height[l] < height[r]){
                if(lmax > height[l]){
                    total+= lmax - height[l];
                }
                else{
                    lmax = height[l];
                }
                l++;
            }
            else{
                if(rmax>height[r]){
                    total += rmax - height[r];
                }
                else{
                    rmax = height[r];
                }
                r--;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,2,1};
        System.out.println(trap_water(height));
    }
}
