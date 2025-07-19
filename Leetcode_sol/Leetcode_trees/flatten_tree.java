package Leetcode_sol.Leetcode_trees;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }
}

public class flatten_tree {
    public static void flatten(Node root){
        Node current = root;
        while(current != null){
            if(current.left != null){
                Node temp = current.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null; 
            }
            current = current.right;
        }
    }
    public static void main(String[] args) {
        
    }
}
