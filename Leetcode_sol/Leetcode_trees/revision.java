package Leetcode_sol.Leetcode_trees;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left, right;

    Node(int n){
        this.data = n;
        left = null;
        right = null;
    }
}

public class revision {

    Node root;

    public final void insert(int data){
        if(root == null){
            Node root = new Node(data);
        }
        else if(data<root.data){
            root.left.data = data;
        }
        else{
            root.right.data = data;
        }
    }

    public static List<Integer> helper_preorder(Node root, List<Integer> list)
    {
        if(root == null) return null;
        list.add(root.data);
        helper_preorder(root.left, list);
        helper_preorder(root.right, list);
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        Node firstNode = new Node(4);
        Node secondNode = new Node(9);


        root.left = firstNode;
        root.right = secondNode;

        List<Integer> list = new ArrayList<>();

        helper_preorder(root, list);
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
