public class LinkedList{

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

    public void addFirst(int data){
        //Create new node
        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
            return;
        }

        //new node's next = head
        newNode.next = head;

        //head = new node
        head = newNode;
    }

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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();

        ll.addLast(3);
        ll.addLast(4);
        ll.printLL();


    }

}

