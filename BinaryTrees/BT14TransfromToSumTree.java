public class BT14TransfromToSumTree{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private  static int sumTransform(Node root){
        if(root == null){
            return 0;
        }

        int leftChild  = sumTransform(root.left);
        int rightChild = sumTransform(root.right);
        
        int data  = root.data;

        int left = root.left==null? 0 : root.left.data;
        int right = root.right==null? 0 : root.right.data; 
        root.data = leftChild + rightChild + left + right;

        return data;
    }

    private  static void preorder(Node root){
            if(root == null){
                System.out.print(-1+ " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right =new Node(7);
        sumTransform(root);
        preorder(root);

    }
}