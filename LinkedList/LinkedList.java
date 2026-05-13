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

    public void add(int data,int index){
        Node temp = head;
        int i = 0;

        while(i<index-1){
            temp = temp.next;
            i++;
        }

        //1.Create new Node;
        Node newNode = new Node(data);

        //2.new node's next = temp's next, after the while temp will the previous node of index.
        newNode.next = temp.next;

        //3.temp's next = new node
        temp.next = newNode;

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
        ll.addLast(5);
        ll.addLast(7);
        ll.printLL();

        ll.add(6, 5);
        ll.printLL();

    }

}

