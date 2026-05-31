import java.util.*;
@SuppressWarnings("unused")
public class BT08TopViewOfATree{
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

    static class Info{
        Node node;
        int horizontalDistane;

        public Info(Node node, int hd){
            this.node = node;
            this.horizontalDistane = hd;
        }
    }

    public static void topView(Node root){

        //level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0;
        int max = 0;

        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.horizontalDistane)){
                    map.put(curr.horizontalDistane,curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left,curr.horizontalDistane-1));
                    min = Math.min(min,curr.horizontalDistane-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right,curr.horizontalDistane+1));
                    max = Math.max(max,curr.horizontalDistane+1);
                }
            }
        }
        for(int i = min;i<=max;i++){
            System.out.println(map.get(i).data+" ");
        }
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

        topView(root);
    }

    
}