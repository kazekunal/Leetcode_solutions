package Leetcode_sol.blind75;

class ListNode{

    ListNode next;
    int data;

    ListNode(int data1, ListNode next){
        this.data = data1;
        this.next = next;
    }

}

public class q16 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head; 
        for(int i = 0; i<n; i++){
            fast = fast.next;
            
        }

        if (fast == null) return head.next;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        
    }
}
