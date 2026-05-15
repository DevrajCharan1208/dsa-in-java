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
    public static int size;

    public void addFirst(int data){
        //Create new node
        Node newNode = new Node(data);
        size++;

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
        size++;

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
        size++;

        //2.new node's next = temp's next, after the while temp will the previous node of index.
        newNode.next = temp.next;

        //3.temp's next = new node
        temp.next = newNode;

    }

    public int removeFirst(){
        if(size==0){
            System.out.println("List is Empty.");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("List is Empty.");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            return val;
        }

        Node temp = head;
        for(int i = 0; i<size-2;i++){
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        size--;
        return val;
        
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

    public int search(int key){
        int idx = 0;
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            idx++;
            temp=temp.next;
        }
        return -1;
    }

    public void deleteNthFromEnd(int n){
        int sz = 0;

        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;
        }

        Node prev = head;
        int i = 1;
        int toFind = sz-n;
        while(i<toFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        size--;
    }

    //recursion search
    public int helper(int key,Node head){
        if(head.next==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(key, head.next) + 1;
        if(idx == -1){
            return -1;
        }

        return idx;
    }

    public int recSearch(int key){
        return helper(key, head);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next; 

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2!= null){
            if(head1.data>head2.data){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }else{
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
        }

        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        //base
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);
        //divide list
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge

        return merge(newLeft, newRight);

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        //adding Node to first
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();

        //adding Node to last
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(7);
        ll.printLL();

        //adding NOde at index 
        ll.add(6, 5);
        ll.printLL();
        System.out.println(size);

        //removing Node from start
        ll.removeFirst();
        ll.printLL();
        System.out.println(size);


        //removing Node from last
        ll.removeLast();
        ll.printLL();
        System.out.println(ll.search(4));
        System.out.println(ll.recSearch(4));

        //reversing LL
        ll.reverse();
        ll.printLL();

        //removing nth Node from end
        ll.deleteNthFromEnd(2);
        ll.printLL();

        //merge sort
        ll.addLast(1);
        ll.add(3, 3);

        System.out.println("\nBefore sorting..");
        ll.printLL();
        head = ll.mergeSort(head);
        System.out.println("\nAfter sorting..");
        ll.printLL();
    }

}

