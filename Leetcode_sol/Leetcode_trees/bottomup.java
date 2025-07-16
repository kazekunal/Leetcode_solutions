package Leetcode_sol.Leetcode_trees;
import java.util.*;

class Node{
    int data;
    Node right, left;

    Node(int data){
        this.data = data;
    }
}

public class bottomup {
    public static List<List<Integer>> bottom(Node root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<level; i++){
                Node current = queue.poll();

                list.add(current.data);

                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            res.add(0, list);
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

        System.out.println(bottom(root));
    }
}
