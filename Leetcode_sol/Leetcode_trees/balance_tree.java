package Leetcode_sol.Leetcode_trees;
//check whether a binary tree is balanced or not -
//balanced tree is a tree where the difference in height of the left subtree and right subtree is less than or equal to 1

class Node{
    int data;
    Node left,right;
    Node(int n){
        this.data = n;
        left = null;
        right = null;
    }
}

public class balance_tree {

    public static boolean isBalanced(Node root) {
        return height(root) != -1;
    }

    // Helper method to calculate the height of a node
    // Returns -1 if the subtree is unbalanced
    private static int height(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        if (leftHeight == -1) return -1; 

        int rightHeight = height(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Current subtree is unbalanced
        }

        return Math.max(leftHeight, rightHeight) + 1; // Return height of the current node
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //example tree - 
        //     1
        //   2    3
        //  4 5  6 7
        System.out.println(isBalanced(root));
    }
}
