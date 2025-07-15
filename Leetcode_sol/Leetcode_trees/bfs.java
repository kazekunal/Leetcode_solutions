package Leetcode_sol.Leetcode_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int n){
        this.data = n;
        left = null;
        right = null;
    }
}

public class bfs {
    public static List<List<Integer>> bfs_out(Node root){

        List<List<Integer>> res = new ArrayList<>(); // for representing the output

        if(root == null) return res; // edge case for no nodes

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root); //  queue having the first element

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            while(size-- > 0){
                Node node = queue.poll();
                level.add(node.data);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }

            res.add(level);
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
