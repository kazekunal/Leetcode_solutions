package Leetcode_sol.Leetcode_linkedList;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data=data;
        this.next = null;
    }
}

//in order to check for a palindrome we have to use 3 steps ->
//1. find the middle of the linkedlist
//2. we have to reverse the second half of the linkedlist
//3. check if the reversed linkedlist is same as first non reversed linkedlist

public class palindromeLL {

    //we use the recursion reverse technique in order to reverse the linkedlist

    public static Node recursion_reverse(Node head) {
        if(head.next == null || head == null ) return head;

        Node newhead = recursion_reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }

    public static Boolean palindrome(Node head) {

        // edge cases - 
        if(head.next == null || head.next.next == null) return true;

        //to find the middle of the linkedlist we can use tortoise and hare method
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node new_head = recursion_reverse(slow.next);

        // now we check the 2nd part of the linkedlist and compare it with the first
        Node first = head;
        Node second = new_head;

        while(second!=null){
            if(first.data != second.data){
                recursion_reverse(new_head);
                return false;
            } 

            first = first.next;
            second = second.next;
        }
        recursion_reverse(new_head);
        return true;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        Boolean a = palindrome(head);
        System.out.println(a);
    }
}
