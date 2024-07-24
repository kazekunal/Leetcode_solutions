package Leetcode_sol.Leetcode_linkedList;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class reverse_LL {
    public static Node convertarr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverse_ll(Node head,Node back) {
        if(head == null || head.next == null){
            return head;
        }

        Node curr = head;
        while(curr!=null){
            back = curr.prev;
            curr.prev = curr.next;
            curr.next = back;
            curr = curr.prev;
        }
        return back.prev;
       
   }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node head = convertarr2LL(arr);
        print(head);
        head = reverse_ll(head,null);
        print(head);
    }
}
