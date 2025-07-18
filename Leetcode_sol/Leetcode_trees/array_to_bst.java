package Leetcode_sol.Leetcode_trees;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
    }
}

public class array_to_bst {
    public Node arraybst(int[] nums){
        if(nums == null || nums.length == 0) return null;

        return createbst(nums, 0, nums.length - 1);
    }

    public static Node createbst(int[] nums, int left, int right){
        if(left > right) return null;

        int mid = left + (right - left) / 2;
        Node root = new Node(nums[mid]); // make the root node the middle positioned element

        root.left = createbst(nums, left, mid-1);
        root.right = createbst(nums, mid + 1, right);

        return root;
    }
    public static void main(String[] args) {
        
    }
}
