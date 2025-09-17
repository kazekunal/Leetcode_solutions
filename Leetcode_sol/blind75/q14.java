package Leetcode_sol.blind75;

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

public class q14 {
    public static Node mergeList(Node list1, Node list2){
        if(list1 == null || list2 == null){
            return list1 == null ? list2 : list1;
        }
        if(list1.data > list2.data){
            Node temp = list1;
            list1 = list2;
            list2 = temp;
        }

        list1.next = mergeList(list1.next, list2);
        return list1;
    }
    public static void main(String[] args) {
        
    }
}
