package Leetcode_sol.Leetcode_trees;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        right = null;
        left = null;
    }
}

public class identical_trees {
    public static boolean check(Node root1, Node root2){
        if(root1 == null || root2 == null) return root1 == root2;
        
        return (root1.data == root2.data) && check(root1.left, root2.left) && check(root1.right, root2.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node root2 = new Node(2);
        System.out.println(check(root1, root2));
    }
}
