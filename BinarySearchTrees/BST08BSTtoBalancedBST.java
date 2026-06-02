
import java.util.*;

public class BST08BSTtoBalancedBST{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    private static Node bSTtoBalancedBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        inorderHelper(root, list);

        root = balancedBST(list, 0, list.size()-1);
        return root;
    }

    private static Node balancedBST(ArrayList<Integer> list, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(list.get(mid));

        root.left =balancedBST(list, start, mid-1);
        root.right = balancedBST(list, mid+1, end);

        return root;
    }

    private static void preorder(Node root){
        if(root == null){
            System.out.print(-1+ " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorderHelper(Node root, ArrayList<Integer> list){
        if(root == null){
            return ;
        }
        inorderHelper(root.left, list);
        list.add(root.data);
        inorderHelper(root.right, list);

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        preorder(root);
        root = bSTtoBalancedBST(root);
        System.out.println("");
        preorder(root);
    }
}