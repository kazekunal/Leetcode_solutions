package Leetcode_sol.Leetcode_linkedList;

class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class remove_LL {
    public static Node remove(Node head,int n) {
        Node temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }

        if(cnt == n) {
            return head.next;
        }

        int res = cnt - n;
        temp = head;
        while(temp!=null){
            res--;
            if(res == 0) break;

            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    //better remove method using tortoise and hare method
    public static Node better_remove(Node head,int n) {
        Node slow = head;
        Node fast = head;
        for(int i = 0; i<n; i++){
            fast = fast.next;
        }

        if(fast==null){
            return head.next;
        }

        while(fast.next!= null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    public static void print(Node head) {
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head = remove(head, 4);
        print(head);

        head = better_remove(head, 4);
        print(head);
    }
}
