package Leetcode_sol.Leetcode_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//example tree - 
//     1
//   2    3
//  4 5  6 7

//traversals - 
//inorder traversal - left root right
//4 2 5 1 6 3 7
//preorder traversal - root left right
//1 2 4 5 3 6 7
//postorder traversal - left right root
//4 5 2 6 7 3 1
//level order traversal - 
//1 2 3 4 5 6 7

class Node{
    int data;
    Node left,right;
    Node(int n){
        int data = n;
        left = null;
        right = null;
    }
}

public class dfs {
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public static List<List<Integer>> level_order(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();

        if(root == null){
            return list;
        }

        queue.offer(root); //offer is used instead of add()method

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for(int i = 0; i < level; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().data);
            }
            list.add(sublist);
        }

        return list;
    }

    public static List<Integer> stack_preorder(Node root){
        List<Integer> preorder = new ArrayList<>();
        if(root == null){
            return preorder;
        }

        Stack<Node> st = new Stack<Node>();
        st.push(root);

        while(!st.isEmpty()){
            root = st.pop();
            preorder.add(root.data);

            if(root.right != null){
                st.push(root.right);
            }
            if(root.left != null){
                st.push(root.left);
            }
        }
        return preorder;
    }

    public static List<Integer> stack_inorder(Node root){
        List<Integer> list = new ArrayList<Integer>();
        Stack<Node> st = new Stack<Node>();

        Node Tempnode = root;
        while(true){
            //basically the idea behind it is to check that the left is null, when we get the left node as null we add that value to the list and go to the right. 
            //if the rightnode is also null, then we add the value to the list
            if(Tempnode!=null)
            {
                st.push(Tempnode);
                Tempnode = Tempnode.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                Tempnode = st.pop(); //when we pop from the main stack, we have backtracked
                list.add(Tempnode.data); //we add to the list the poped value
                Tempnode = Tempnode.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // Initialize and allocate memory for tree nodes
        Node root = new Node(1);
        // Node secNode = new Node(1);
        // Node thirNode = new Node(3);

        //connect the binary tree nodes
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //example tree - 
        //     1
        //   2    3
        //  4 5  6 7
        System.out.println("Preorder traversal is - ");
        preorder(root);
        System.out.println("inorder traveral is -");
        inorder(root);
        System.out.println("postorder traveral is -");
        postorder(root);
        System.out.println("level order traveral is -");
        System.out.println(level_order(root));
        System.out.println("preorder using stack data structure - ");
        System.out.println(stack_preorder(root));
        System.out.println("inorder using stack data structure - ");
        System.out.println(stack_inorder(root));
    }
}
