package Leetcode_sol.Leetcode_linkedList;

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

public class rotate_LL {

    public static Node rotate_1place(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        Node tail = temp;
        tail.next = head;
        prev.next = null;
        return tail;
    }
    
    public static Node rotate_kplaces(Node head, int k) {

        Node tail = head;
        int len = 1;

        while(tail.next!=null){
            len++;
            tail = tail.next;
        }

        tail.next = head;

        k=k%len;

        if(k == 0) return head;
        
        tail = head;
        for(int i = 0; i<len-k-1; i++) //i<len-k-1 is the imp step
        { 
            tail = tail.next;
        }

        head = tail.next;
        tail.next = null;

        return head;

        }
        // Node temp = head;
        // Node tail = head;
        // int len = 0;
        // Node prev = null;
        // while(temp.next!=null){
        //     len++;
        //     if(len == len - k){
        //         prev = temp;
        //     }
        //     temp = temp.next;
        // }

        // if(k%len == 0) return head;

        // tail = temp;
        // tail.next = head;
        // head = prev.next;
        // prev.next = null;
        // return head;
    

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

        print(head);
        System.out.println();
        // Node ans = rotate_1place(head);
        // print(ans);
        Node ans = rotate_kplaces(head, 1);
        print(ans);
    }
}
