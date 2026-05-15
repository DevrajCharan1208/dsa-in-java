public class LL03ZigZagLL{


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.printLL();

        list.zigZag();
        list.printLL();
    }

}

class LinkedList{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data){
        //Create new node
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        //tail's next = new node
        tail.next = newNode;
        //tail = new node
        tail = newNode;        
    }

    public void printLL(){
        Node temp = head;
        if(head==null){
            System.out.println("LL is empty.");
        }
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

     private Node getMid(Node head){
            Node slow = head;
            Node fast = head.next;

            while(fast!=null&&fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
    }

    public void zigZag(){

        
        //Step 1. find mid
        Node mid = getMid(head);

        //Step 2. reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node rHead = prev;

        //Step 3. alternate merging
        Node lHead = head;

        Node nextL;
        Node nextR;
        while(rHead!=null&&lHead!=null){
            nextL = lHead.next;
            lHead.next = rHead;
            nextR = rHead.next;
            rHead.next = nextL;

            rHead = nextR;
            lHead = nextL;
        }

    }
}