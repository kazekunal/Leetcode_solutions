package Leetcode_sol.Leetcode_linkedList;

public class reverse_singleLL {
    public static Node reverse(Node head) {
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static Node recursion_reverse(Node head) {
        if(head.next == null || head == null ) return head;

        Node newhead = recursion_reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }

    public static Node print(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // print(head);

        // head = reverse(head);

        head = recursion_reverse(head);
        print(head);


    }
}
