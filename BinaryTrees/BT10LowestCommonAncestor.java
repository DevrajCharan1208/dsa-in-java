
import java.util.ArrayList;

public class BT10LowestCommonAncestor{
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

    private static Node lowestCommonAncestor(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        path(root, n1, path1);
        path(root,n2,path2);

        int i = 0;
        for(; i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);
    }

    private static boolean path(Node root, int n, ArrayList<Node> list){
        if(root == null){
            return false;
        }
        list.add(root);

        if(root.data == n){
            return true;
        }
        boolean founddLeft = path(root.left, n, list);
        boolean foundRight = path(root.right, n, list);

        if(founddLeft||foundRight){
            return true;
        }

        list.removeLast();
        return false;


    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right =new Node(7);
        int n1 = 4;
        int n2 = 5;
        System.out.println(lowestCommonAncestor(root, n1, n2).data);
    }
}