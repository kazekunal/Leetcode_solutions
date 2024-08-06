package Leetcode_sol.Leetcode_linkedList;

import java.security.DrbgParameters.NextBytes;

class Node {
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

public class delete_middle {

    //brute force method - two pass solution
    public static Node del_middle(Node head) {
        Node temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        temp = head;
        int res = cnt/2;
        Node prev = null;
        for(int i = 0; i<res; i++){
            prev = temp;
            temp = temp.next;
        }
        if(prev == null) {
            head = head.next;
        } else {
            prev.next = temp.next;
        }
        return head;
    }

    //better solution - tortoise and hare method - skip 1 step to reach before the middle node
    public static Node del_middle_better(Node head) {
        Node slow = head;
        Node fast = head;

        fast = fast.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Node ans = del_middle(head);
        // print(ans);

        System.out.println();
        Node better_ans = del_middle_better(head);
        print(better_ans);
    }
}
