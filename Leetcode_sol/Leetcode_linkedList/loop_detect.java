package Leetcode_sol.Leetcode_linkedList;

import java.util.HashMap;

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

public class loop_detect {

    //using the method of hashing - poor approach due to space complexity of O(n)

    public static boolean Loop_hash(Node head) {
        HashMap<Node, Boolean> hashMap = new HashMap<>(); //new hashmap
        Node temp = head;
        while(temp!=null){
            if(hashMap.containsKey(temp)) return true;
            hashMap.put(temp, true);
            temp = temp.next;
        }
        return false;
    }
    //tortoise and hare solution - better approach

    public static boolean Loop(Node head) {
        
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public static int LenghtofLoop(Node head) {
        Node slow = head;
        Node fast = head;
        int cnt = 1;

        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }

        slow = slow.next; //imp step to push the slow to the next linkedlist

        while(slow != fast){
            slow = slow.next;
            cnt++;
        }
        return cnt;
    }

    public static void print(Node head) {
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5,head);

        // print(head);

        System.out.println(Loop_hash(head));

        System.out.println(Loop(head)); 

        System.out.println(LenghtofLoop(head));
    }
}

