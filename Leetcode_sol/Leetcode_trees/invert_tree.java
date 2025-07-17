package Leetcode_sol.Leetcode_trees;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }
}

public class invert_tree {
    public static Node invert(Node root){
        Node current = root;

        if(current == null) return null;

        Node right = invert(root.right);
        Node left = invert(root.left);

        root.right = left;
        root.left = right;

        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        Node first = new Node(9);
        Node sec = new Node(20);
        // Node fourth = new Node(15);
        // Node fifth = new Node(7);

        root.left = first;
        root.right = sec;
        // root.right.left = fourth;
        // root.right.right = fifth;

        System.out.println(invert(root));
    }
}
