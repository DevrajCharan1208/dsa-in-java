import java.util.*;
@SuppressWarnings("static-access")
public class Q03UsingTwoStacks{
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int n){ //O(n)
           while(!s1.isEmpty()){
            s2.push(s1.pop());
           }
           
           s1.push(n);
           
           while(!s2.isEmpty()){
            s1.push(s2.pop());
           }
        }
        
        public static int remove(){ //O (1)
            if(s1.isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            int front = s1.pop();
            return front;
        }

        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q  = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}