package Leetcode_sol.blind75;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class q15 {

    public static Node mergek(Node[] lists){
        if(lists == null || lists.length == 0){
            return null;
        }

        Node dummy = new Node(0);
        Node curr = dummy;

        Queue<Node> minheap = new PriorityQueue<>(Comparator.comparingInt(a -> a.data));

        for(Node list: lists){
            if(list != null) minheap.offer(list);

            while(!minheap.isEmpty()){
                Node min = minheap.poll();
                if(min.next != null){
                    minheap.offer(min.next);
                }
                curr.next = min;
                curr = curr.next;

            }

        }
        return dummy.next;
        
    }
    public static void main(String[] args) {
        
    }
}
