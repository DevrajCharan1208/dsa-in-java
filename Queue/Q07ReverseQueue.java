
import java.util.*;

public class Q07ReverseQueue{

    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int n = q.size();

        for(int i = 0; i < n; i++){
            s.push(q.remove());
        }
        for(int i = 0; i < n; i++){
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));

        reverseQueue(q);
        System.out.println(q);
    }
}