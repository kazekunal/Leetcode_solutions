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


public class add_LL {

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

    public static Node add_ll(Node head1, Node head2){
        Node ans_node = new Node(-1);
        Node curr = ans_node;
        Node temp1 = head1;
        Node temp2 = head2;

        int carry = 0;
        while(temp1!= null || temp2 != null){
            int sum = carry;
            if(temp1 != null){
                sum += temp1.data; 
            }
            if(temp2 != null){
                sum += temp2.data; 
            }
            Node new_node2 = new Node(sum%10);

            carry = sum/10;

            curr.next = new_node2;
            curr = curr.next;

            if(temp1 != null){
                temp1 = temp1.next; 
            }
            if(temp2 != null){
                temp2 = temp2.next; 
            }

        }
        if(carry != 0){
            Node new_node = new Node(carry);
            curr.next = new_node;
        }
        return ans_node.next;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,0,0,0};
        Node head1 = convertarr2ll(arr1);

        int[] arr2 = {9,9,9,9};
        Node head2 = convertarr2ll(arr2);

        Node ans = add_ll(head1, head2);
        ans = reverse(ans);
        print(ans);

    }
}
