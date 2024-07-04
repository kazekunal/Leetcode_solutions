package Leetcode_sol;

public class Solution_31 {
    public static void next_perm(int[] nums) {
        int i = nums.length - 2;
        int j = nums.length - 1;

        if (nums == null || nums.length <= 1) {
            System.out.println("The array is empty or contains a single element");
            return;
        }
        
        while (i >= 0 && nums[i] >= nums[j]) {
            i--;
        }

        if (i >= 0) {
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        
        reverse(nums, j, j);
        
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,5,6};
        next_perm(arr);
    }
}
