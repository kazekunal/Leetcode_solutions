package Leetcode_sol.Leetcode_linkedList;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data =data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class add1LL {

    public static Node print(Node head) {
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return head;
    }

    //recursion and backtracking
    public static int addhelper(Node temp) {
        if(temp == null) return 1; //break out of the function
        int carry = addhelper(temp.next); //recursion having carry
        temp.data += carry; // carry added to the data
        if(temp.data < 10 ) return 0; //break out of the function if no carry
        temp.data = 0; //0 can be the only case as we are adding 1
        return 1;
    }

    public static Node add1(Node head) {
        int carry = addhelper(head); //we get the carry from the above function
        //only condition when a new node is to be added to the linkedlist
        if(carry == 1){ 
            Node new_node = new Node(1);
            new_node.next = head;
            head = new_node;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);

        print(head);

        System.out.println();
        Node ans = add1(head);
        print(ans);
    }
}
