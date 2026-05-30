import java.util.*;
public class TR09KthLevel{
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> kthLevelOfTree(Node root, int k){
        ArrayList<Integer> list = new ArrayList<>();
        helper( root,  0,  k , list);
        return list;
    }
    
    private static  void helper(Node root, int level, int k , ArrayList<Integer> list){
        if(root==null){
            return;
        }
        if(level == k){
            list.add(root.data);
            return;
        }
        helper(root.left, level+1, k, list);
        helper(root.right, level+1, k, list);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right =new Node(7);
        root.right.right.right = new Node(8);
        System.out.println(kthLevelOfTree(root, 0));
        System.out.println(kthLevelOfTree(root, 1));
        System.out.println(kthLevelOfTree(root, 2));
        System.out.println(kthLevelOfTree(root, 3));
        

    }
}