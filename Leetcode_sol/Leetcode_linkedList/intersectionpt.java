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

public class intersectionpt {
    public static void print(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    //time complexity -> O(n) 
    public static int intersection(Node head1, Node head2) { 
        Node temp1 = head1;
        Node temp2 = head2;

        //this would not work when there are repeated data in linkedlists
        while(temp1!=null){
            if(temp1.data == temp2.data) return temp1.data;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return 0;
    }

    public static int better_intersection(Node head) {
        //this method uses recursion and backtracking
        return 0;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        Node head2 = new Node(9);
        head2.next = new Node(8);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);

        print(head1);
        System.out.println();
        print(head2);
        System.out.println();

        int ans = intersection(head1, head2);
        System.out.print(ans);

        
    }
}
