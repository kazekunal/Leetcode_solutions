package Leetcode_sol.Leetcode_trees;
import java.util.*;;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }
}

public class boundary {
    public static boolean isleaf(Node node) {
        return node.left == null && node.right == null;
    }
    public static void leftboundary(Node root, ArrayList<Integer> res){
        Node curr = root.left;
        while(curr != null){
           if(isleaf(curr) == false) res.add(curr.data);
           if(curr.left != null) curr = curr.left;
           else curr = curr.right; 
        } 
    }

    public static void rightboundary(Node root, ArrayList<Integer> res){
        ArrayList<Integer> tmp = new ArrayList<>();
        Node curr = root.right;
        while(curr != null){
           if(isleaf(curr) == false) tmp.add(curr.data);
           if(curr.right != null) curr = curr.right;
           else curr = curr.left; 
        } 
        for(int i = tmp.size() - 1; i>=0; i--){
            res.add(tmp.get(i));
        }
    }
    public static void addleaves(Node root, ArrayList<Integer> res) {
        if (isleaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addleaves(root.left, res);
        if (root.right != null) addleaves(root.right, res);
    }

    public static List<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        if (!isleaf(root)) res.add(root.data);

        leftboundary(root, res);
        addleaves(root, res);
        rightboundary(root, res);

        return res;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);

        List<Integer> boundary = boundaryTraversal(root);
        System.out.println("Boundary Traversal: " + boundary);
    }
}
