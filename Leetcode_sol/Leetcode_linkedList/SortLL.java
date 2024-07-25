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

public class SortLL {
    public static Node Sort(Node head) {

        //brute force method -->> O(2N) and O(n)

        Node temp = head;
        int cnt = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        while(temp!= null){
            if(temp.data == 0){
                cnt++;
            } 
            else if(temp.data == 1){
                cnt1++;
            }
            else{
                cnt2++;
            }
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null){
            if(cnt != 0){
                temp.data = 0;
                cnt--;
            }
            else if(cnt1!=0){
                temp.data = 1;
                cnt1--;
            }
            else{
                temp.data = 2;
                cnt2--;
            }
            temp = temp.next;
        }
        return head;

    }

    public static Node better_sort(Node head) { // better Sort -->> O(n) and O(1)

        if(head == null || head.next == null) return head;

        Node zero_node = new Node(-1);
        Node one_node = new Node(-1);
        Node two_node = new Node(-1);
        Node zero = zero_node;
        Node one = one_node;
        Node two = two_node;

        Node temp = head;
        while(temp!= null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }
            else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
            
        }
        zero.next = (one_node.next != null)?one_node.next:two_node.next; //most important step
        // one.next = (two_node.next != null)?two_node.next:null; //not needed
        one.next = two_node.next;
        two.next = null;
        head = zero_node.next;
        return head;
    }

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
        head.next.next = new Node(1);
        head.next.next.next = new Node(0);

        print(head);

        System.out.println();

        // Node ans = Sort(head);
        Node ans = better_sort(head);
        print(ans);
    }
}
