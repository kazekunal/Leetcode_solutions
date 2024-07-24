package Leetcode_sol.Leetcode_linkedList;

//implementation of linkedlist

//definition of single linked list
class Node{

    Node next;
    int data;

    Node(int data1, Node next){
        this.data = data1;
        this.next = next;
    }

    Node(int data2){
        this.data = data2;
        this.next = null;
    }

}

public class linkedlist {

    public static Node convertarr2ll(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;

    }

    public static void print(Node head) {
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static int LenghtofLL(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static boolean search(Node head,int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data == val){
                return true;
                
            }
            temp = temp.next;
        }
        return false;
    }

    //thing to note in java, you do not need to free up space as there is a garbage collector functionality which clears the memory space which does not have any memory allocation or reference
    public static Node delete_head(Node head) {
        if(head == null || head.next == null) {
            return null;
        }

        head = head.next;
        return head;
    }

    public static Node delete_tail(Node head) {
        if(head == null || head.next == null) return null;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node delete_k(Node head, int k) {
        if(head == null) return head;

        if(k == 1){
            head = head.next;
            return head;
        }

        int cnt = 0;
        Node temp = head;
        Node prev = null;

        while(temp!=null){
            cnt++;
            if(cnt == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    public static Node delete_val(Node head, int val) {
        if(head == null) return head;

        if(head.data == val){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while(temp!=null){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    public static Node insert_head(Node head, int val) {
        return new Node(val, head);
    }

    public static Node insert_tail(Node head, int val) {

        if(head == null){
            return new Node(val);
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        Node new_node = new Node(val);

        temp.next = new_node;

        return head;
    }

    public static Node insert_k(Node head, int k, int val) {
        if(head == null){
            return new Node(val);
        }

        if(k==1){
            return new Node(val, head);
        }

        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            cnt++;
            if(cnt != (k-1)){
                Node x = new Node(val, temp.next);
                temp.next = x;
                break; 
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // Node y = new Node(arr[0]);
        // System.out.println(y.data);

        Node head = convertarr2ll(arr);

        print(head); //printing the linkedlist

        System.out.println(LenghtofLL(head));

        System.out.println(search(head, 5));

        head = delete_head(head);
        print(head); //printing the deleted head linkedlist

        head = delete_tail(head);
        print(head);
        
        head = delete_k(head, 0);
        print(head);

        head = delete_val(head, 3);
        print(head);

        head = insert_head(head, 100);
        print(head);

        head = insert_tail(head, 10);
        print(head);

        head = insert_k(head, 4, 500);
        print(head);
    }
}
