public class BT05DiameterOfTree{
    @SuppressWarnings("unused")
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

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        int rootH = lh+rh+1;
        int lDiam = diameter(root.left);
        int rDiam = diameter(root.right);

        return Math.max(rootH,Math.max(lDiam,rDiam));

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

        System.out.println(diameter(root));
    }
}
