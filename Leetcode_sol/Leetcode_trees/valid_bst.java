package Leetcode_sol.Leetcode_trees;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }
}

public class flatten_better {

    public static boolean isvalid(Node root){
        return helper(root, null, null);
    }

    public static boolean helper(Node root, Integer low, Integer high){
        if(root == null) return true;

        if(low != null && root.data <= low) return false;

        if(high != null && root.data >= high) return false;

        boolean treeleft = helper(root.left, low, high);

        boolean treeright = helper(root.right, low, high);

        return treeleft && treeright;

    }
    public static void main(String[] args) {
        
    }
}
