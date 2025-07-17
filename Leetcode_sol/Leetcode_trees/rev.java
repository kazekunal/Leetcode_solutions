package Leetcode_sol.Leetcode_trees;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }
}

public class rev {

    public static boolean symm(Node root){

        if(root == null) return false;
        return ismirror(root.left,root.right);
    }

    public static boolean ismirror(Node left, Node right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        
        return (left.data == right.data) && ismirror(left, right) && ismirror(left.right, right.left);
    }
    public static void main(String[] args) {
        Node root = new Node(0);
        Node left = new Node(2);
        Node right = new Node(4);
        root.left = left;
        root.right = right;

        System.out.println(symm(root));
    }
}
