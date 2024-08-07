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

public class rev_k {

    //hard level leetcode problem due to the presence of 3 functions - 
    //1. finding the kth node
    //2. reversing the broken path of linkedlist
    //3. joining the reversed linkedlist

    public static Node find_kth(Node temp, int k) {
        int a = k-1;
        while(temp!=null && a>0 ){
            a -= 1;
            temp = temp.next;
        }
        return temp;
    }

    //reversing node in k groups
    public static Node reverse_k_group(Node head, int k) {
        Node temp = head;
        Node prevNode = null;
        while(temp!=null){
            Node kthNode = find_kth(temp,k);
            if(kthNode == null){
                if(prevNode!=null) prevNode.next = temp;
                break;
            }
            Node nextNode = kthNode.next;
            kthNode.next = null;

            reverse(temp);
            if(temp == head){
                head = kthNode;
            }
            else{
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode; 
        }
        
        return head;
    }

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
        head.next.next.next.next = new Node(5);

        print(head);
        System.out.println();
        Node ans = reverse_k_group(head, 1);
        print(ans);
    }
}
