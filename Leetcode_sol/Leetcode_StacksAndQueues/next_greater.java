package Leetcode_sol.Leetcode_StacksAndQueues;

import java.util.Stack;

//monotonic stack - storing elems in a specific order.
//for loop (for loop (if no. > diff_array no.)) - O(n2)
//better approach - 
//back traversal for the stack

public class next_greater {
    public static int[] nge(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int index = stack.pop();
                if (contains(nums1, nums2[index])) {
                    ans[indexInArray(nums1, nums2[index])] = nums2[i];
                }
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            if (contains(nums1, nums2[index])) {
                ans[indexInArray(nums1, nums2[index])] = -1;
            }
        }

        return ans;
    }

    public static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static int indexInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ans = nge(nums1, nums2);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}

//using 2d array
// int[] ans = new int[nums1.length];

        // for(int i = 0; i<nums1.length; i++){
        //     for(int j = i+1; j<nums2.length; j++){
        //         boolean found = false;
        //         if(nums1[i] == nums2[j]){
        //             found = true;
        //         }
        //         if(found && nums2[j]>nums1[i]){
        //             ans[i] = nums2[j];
        //             break;
        //         }
        //     }
        //     if(!found || ans[i] == 0){
        //         ans[i] = -1;
        //     }
        // }
        // return ans;
