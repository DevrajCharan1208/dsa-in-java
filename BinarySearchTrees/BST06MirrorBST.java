public class BST06MirrorBST{
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

    private  static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private  static void mirrorBST(Node root){
        if (root == null){
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorBST(root.right);
        mirrorBST(root.left);
    }

    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println("");
        mirrorBST(root);
        inorder(root);

    }
}