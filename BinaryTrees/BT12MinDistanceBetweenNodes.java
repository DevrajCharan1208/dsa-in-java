public class BT12MinDistanceBetweenNodes{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private  static int lcaDist(Node root, int n){
        if(root==null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist==-1&&rightDist==-1){
            return -1;
        }else if(leftDist == -1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }

    }

    private  static int minDist(Node root, int n1, int n2){
        Node lca = lCA(root, n1, n2);

        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);

        return dist1+dist2;
    }

    //lowest common ancestor
    private static Node lCA(Node root, int n1, int n2){
        if(root == null){
            return null;
        }

        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lCA(root.left, n1, n2);
        Node rightLca = lCA(root.right, n1, n2);

        if(leftLca==null){
            return rightLca;
        }
        if(rightLca==null){
            return leftLca;
        }

        return root;
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
        int n1 = 4;
        int n2 = 6;
        System.out.println(minDist(root, n1, n2));
    }
}