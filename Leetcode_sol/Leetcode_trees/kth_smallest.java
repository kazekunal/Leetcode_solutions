package Leetcode_sol.Leetcode_trees;

// kth smallest -> in order traversal with sorted bst

public class kth_smallest {

    int count = 0;

    public Node helper(Node root, int k){
        if(root == null) return null;

        Node left = helper(root.left, k);

        if(left != null) return left;

        count++;

        if(count == k) return root;

        return helper(root.right, k);
    }

    public int kth(Node root, int k){
        Node temp = helper(root, k);
        return temp.data;
    }

    public void main(String[] args) {

        Node root = new Node(1);

        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(kth(root, 3));
    }
}
