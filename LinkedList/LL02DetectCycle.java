public class LL02DetectCycle{

    public static class Node{
        @SuppressWarnings("unused")
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

    public static boolean isCycle(){
        Node slow = head, fast = head;

        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());

    }

}

