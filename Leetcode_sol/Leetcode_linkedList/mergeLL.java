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

public class mergeLL {
    public static Node merge(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node curr = dummy;

        while(list1!= null || list2!=null){
            if(list1.data <= list2.data){
                curr.next = list1;
                list1 = list1.next;
            } else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;

            if(list1!= null){
                curr.next = list1;
            }else{
                curr.next = list2;
            }
        }

        return dummy.next;
    }
    
}
