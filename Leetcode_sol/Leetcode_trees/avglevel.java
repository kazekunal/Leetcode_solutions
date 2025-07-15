package Leetcode_sol.Leetcode_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class avglevel {
    public static List<Double> avg(Node root){
        List<Double> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            // List<Integer> level = new ArrayList<>();
            double avg = 0;

            while(size-- > 0){
                Node node = queue.poll();
                avg += avg + node.val;
            }
            avg = avg / size;
            res.add(avg);
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
