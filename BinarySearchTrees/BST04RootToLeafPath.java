import java.util.ArrayList;

public class BST04RootToLeafPath{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    private  static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            root.left =  insert(root.left, val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    private  static void printPath(Node root){
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        printRoot2Leaf(root, path, paths);

        System.out.println(paths);
    }


    private static void printRoot2Leaf(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> paths){
        if(root==null){
            return;
        }

        path.add(root.data);
        if(root.left == null && root.right == null){
            paths.add(new ArrayList<>(path));            
        }
        printRoot2Leaf(root.left, path, paths);
        printRoot2Leaf(root.right, path, paths);
        path.removeLast();
    }



    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }

        printPath(root);
        
    }
}