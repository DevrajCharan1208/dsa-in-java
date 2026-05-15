public class DoubleLL{
    
    @SuppressWarnings("unused")
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node (int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        //create node
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;   
    }

    //remove
    public int removeFirst(){
        if(head==null){
            System.out.println("List is empty");
        }

        if(size == 1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }

    public int removeLast(){

         if(head==null){
            System.out.println("List is empty");
        }

        if(size == 1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    //reverse
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //print
    public void print(){
        Node temp = head;
        System.out.print("null<-");
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dLL  = new DoubleLL();
        dLL.addFirst(1);
        dLL.addFirst(2);
        dLL.addFirst(5);
        dLL.addFirst(7);
        dLL.addFirst(4);
        dLL.addFirst(23);
        dLL.addFirst(12);
        dLL.addFirst(3);
        dLL.print();

        dLL.removeFirst();
        dLL.print();
        dLL.removeLast();
        dLL.print();

        dLL.reverse();
        dLL.print();

    }
}