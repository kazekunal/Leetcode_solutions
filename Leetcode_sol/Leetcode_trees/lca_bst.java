package Leetcode_sol.Leetcode_trees;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }
}

public class lca_bst {

    public static Node lca(Node root, Node p, Node q){
        if(root == null) return null;

        if(root == p || root == q) return root;

        Node leftnode = lca(root.left, p, q);
        Node rightnode = lca(root.right, p, q);

        // if(leftnode == null) return root.right;
        // if(rightnode == null) return root.left;

        if(leftnode != null && rightnode != null) return root;

        return leftnode == null ? rightnode : leftnode; // using ternary op for 2 if conditions
    } 
    public static void main(String[] args) {
        Node root = new Node(1);
        // Node secNode = new Node(1);
        // Node thirNode = new Node(3);

        //connect the binary tree nodes
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node ans = lca(root, root.left.right, root.right.left);
        System.out.println(ans.data);

    }
}
