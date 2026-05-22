import java.util.*;
public class Q08QueueUsingDeque{
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addFirst(data);
        }

        public int remove(){
            int front = deque.removeLast();
            return front;
        }

        public int peek(){
            return deque.getFirst();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());

    }
}