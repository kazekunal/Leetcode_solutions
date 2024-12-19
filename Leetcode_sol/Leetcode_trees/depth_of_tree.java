package Leetcode_sol.Leetcode_trees;

class Node{
    int data;
    Node left,right;
    Node(int n){
        this.data = n;
        left = null;
        right = null;
    }
}

//to find the max depth of the tree we can use level order traversal with initialization of a queue or we can use bfs/dfs.
//but the most optimised solution for this would be a recursive solution... ->
public class depth_of_tree {
    public static int depth(Node root){
        if(root == null){
            return 0;
        }
        int lh = depth(root.left);
        int rh = depth(root.right);

        return 1 + Math.max(lh, rh);

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
        System.out.println(depth(root));
    }
}
