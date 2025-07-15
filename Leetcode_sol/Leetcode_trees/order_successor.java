package Leetcode_sol.Leetcode_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node right, left;
    Node(int data){
        this.data= data;
        right = null;
        left = null;
    }
}

public class order_successor {
    public static int succ(Node root, int target){
        if(root == null) return -1;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            while(size-- > 0){
                Node node = queue.poll();
                level.add(node.data);
                if(node.data == target){
                   return queue.isEmpty() ? -1 : queue.peek().data;
                } 
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(succ(root, 2));
    }
}
