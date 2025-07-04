package Leetcode_sol.Leetcode_trees;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class max_pathsum {

    public static int maxPathSum(Node root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxsum(root, max);
        return max[0];
    }

    public static int maxsum(Node root, int[] max) {
        if (root == null) return 0;

        int lh = Math.max(0, maxsum(root.left, max));
        int rh = Math.max(0, maxsum(root.right, max));

        max[0] = Math.max(max[0], lh + rh + root.data);

        return root.data + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println("Max Path Sum: " + maxPathSum(root)); // Should return 42
    }
}
