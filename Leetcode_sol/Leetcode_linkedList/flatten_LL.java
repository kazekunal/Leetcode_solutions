package Leetcode_sol.Leetcode_linkedList;

class Node{
    int data;
    Node next;
    Node down;

    Node(int data, Node next,Node down){
        this.data = data;
        this.next = next;
        this.down = down;
    }

    Node(int data){
        this.data = data;
        this.next = null;
        this.down = null;
    }
}


public class flatten_LL {
    public static Node print(Node head) {
        Node temp = head;
        while(temp.next!=null || temp.down!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            temp = temp.down;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.down = new Node(10);
        head.next.next = new Node(1);
        head.next.next.down = new Node(7);
        head.next.next.down.down = new Node(11);
        head.next.next.down.down.down = new Node(12);
        head.next.next.next = new Node(4);
        head.next.next.next.down = new Node(9);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.down = new Node(5);
        head.next.next.next.next.down.down = new Node(5);

        print(head);

    }
}
