package Leetcode_sol.Leetcode_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class cousins {
    public static boolean cous(Node root, int x, int y){
        if(root == null) return false;
        int left = 0,right = 0;

        Node current = root;
        while(current.left != null){
            left++;
            if(current.left.data == x) break;
            current = current.left;
            
        }
        while(current.right != null){
            right++;
            if(current.left.data == y) break;
            current = current.right;
            
        }
        if(left == right) return true;

        
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        Node first = new Node(9);
        Node sec = new Node(20);
        Node fourth = new Node(15);
        Node fifth = new Node(7);

        root.left = first;
        root.right = sec;
        root.right.left = fourth;
        root.right.right = fifth;

        System.out.println(cous(root, 9, 20));
    }   
}
