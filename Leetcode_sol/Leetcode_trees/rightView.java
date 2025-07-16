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

public class rightView {
    public static List<Integer> right(Node root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i = 0; i<level; i++){
                Node current = queue.poll();

                if(i == level-1){
                    res.add(current.data);
                }
                
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
                
            }
        }

        return res;
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

        System.out.println(right(root));
    }
}
