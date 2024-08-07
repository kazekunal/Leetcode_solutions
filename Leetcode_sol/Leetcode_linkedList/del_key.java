package Leetcode_sol.Leetcode_linkedList;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev){
    this.data = data;
    this.prev = prev;
    this.next = next;
    }

    Node(int data,Node prev){
    this.data = data;
    this.prev = prev;
    this.next = null;
    }
}

public class del_key {
    public static Node del_allkey(Node head, int key) {
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                if(temp == head){
                    head = temp.next;
                }

            Node next_node = temp.next;
            Node prev_node = temp.prev;

            if(next_node!=null) next_node.prev = prev_node;
            if(prev_node!=null) prev_node.next = next_node;
        

        temp = next_node;
    }

        else{
            temp = temp.next;
        }
    }
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
    Node head = new Node(1,null);
    head.next = new Node(2,head);
    head.next.next = new Node(3,head.next);
    head.next.next.next = new Node(4,head.next.next);

    Node ans = del_allkey(head, 2);
    print(ans);
}
}