package Leetcode_sol.Leetcode_trees;


class Node{
    int data;
    Node left,right,next;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
        next = null;
    }
}

public class pop_next {
    public static Node pop(Node root){
        if(root == null) return null;

        Node leftmost = root;
        while(leftmost.left!=null){
            Node current = leftmost;
            while(current != null){
                current.left.next = current.right;
                if(current.next != null){
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftmost = leftmost.left;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        Node first = new Node(9);
        Node sec = new Node(20);
        Node fourth = new Node(15);
        Node fifth = new Node(7);

        root.left = first;
        root.right = sec;
        root.right.left = fourth;
        root.right.right = fifth;

        System.out.println(pop(root));
    }
}
