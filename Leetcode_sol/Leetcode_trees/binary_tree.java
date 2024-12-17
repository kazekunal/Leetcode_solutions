package Leetcode_sol.Leetcode_trees;

//binary trees - heirarchial structures and binary(2) only two sub-branches of a single

class Node{
    int data;
    Node left, right;
    Node(int n){
        data = n;
        left = null;
        right = null;
    }
}

public class binary_tree {
    public static void main(String[] args) {
        // Initialize and allocate memory for tree nodes
        Node firstNode = new Node(2);
        Node secNode = new Node(1);
        Node thirNode = new Node(3);

        //connect the binary tree nodes
        firstNode.left = secNode;
        firstNode.right = thirNode;

        //visualisation - 
        //      2
        //   1     3
        
    }
    
}
