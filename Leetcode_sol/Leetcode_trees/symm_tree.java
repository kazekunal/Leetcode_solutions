package Leetcode_sol.Leetcode_trees;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class symm_tree {
    public static boolean symm(Node root){
        if (root == null) return false;
        return ismirror(root.left, root.right);
    }
    
    public static boolean ismirror(Node left, Node right){
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return (left.data == right.data)
        && ismirror(left, right)
        && ismirror(left.right, right.left);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.left.right.left = new Node(8);
        // root.left.right.right = new Node(9);

        System.out.println("Boundary Traversal: " + symm(root));
    }
}
