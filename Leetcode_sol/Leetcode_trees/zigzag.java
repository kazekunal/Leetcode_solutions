package Leetcode_sol.Leetcode_trees;
import java.util.*;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class zigzag {
    public static List<List<Integer>> zigzag_traversal(Node root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        boolean l2r = true; //flag for left to right

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            LinkedList<Integer> level_linkedlist = new LinkedList<>();
            for(int i = 0; i<levelsize ; i++){
                Node current = queue.poll();
                if(l2r){
                    level_linkedlist.addLast(current.data);
                }
                else{
                    level_linkedlist.addFirst(current.data);
                }

                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }

            res.add(level_linkedlist);
            l2r = false;
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

        System.out.println(zigzag_traversal(root));
    }
}
