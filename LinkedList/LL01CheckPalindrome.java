public class LL01CheckPalindrome{

    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(5);
        list.addLast(2);
        list.addLast(1);

        list.printLL();

        System.out.println(list.isPalindrome());
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

    public boolean isPalindrome(){

        if(head==null || head.next == null){
            return true;
        }

        //Step 1. find mid
        Node slow = head;
        Node fast = head;

        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

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

        //Step 3. check both halfs
        Node lHead = head;
        while(rHead!=null){
            if(lHead.data!=rHead.data){
                return false;
            }
            lHead = lHead.next;
            rHead = rHead.next;
        }
        return true;
    }
}