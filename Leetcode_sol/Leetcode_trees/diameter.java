package Leetcode_sol.Leetcode_trees;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class diameter {

    public static int depth(Node root,int max){
        if(root == null){
            return 0;
        }
        int lh = depth(root.left,max);
        int rh = depth(root.right,max);
        
        max = Math.max(max, lh+ rh);

        return 1 + Math.max(lh, rh);

    }

    public static int diameter(Node root){
        int max = 0;
        depth(root, max);
        return max;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
   
}
