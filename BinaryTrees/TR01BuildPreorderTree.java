
import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("static-access")
public class TR01BuildPreorderTree{
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

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            if(root == null){
                System.out.print(-1+ " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                System.out.print(-1+ " ");
                return;
            }            
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                System.out.print(-1+ " ");
                return;
            }            
            postorder(root.left);            
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curr_Node = q.remove();

                if(curr_Node==null){
                    System.out.println("");
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr_Node.data);
                    if(curr_Node.left!=null){
                        q.add(curr_Node.left);
                    }
                    if(curr_Node.right!=null){
                        q.add(curr_Node.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Preorder Traversal");
        tree.preorder(root);
        System.out.println("");
        System.out.println("Inorder Traversal");
        tree.inorder(root);
        System.out.println("\nPostorder Traversal");
        tree.postorder(root);
        System.out.println("\nLevel Order Traversal");
        tree.levelOrder(root);
    }
}