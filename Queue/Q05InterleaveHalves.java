import java.util.*;
public class Q05InterleaveHalves{

    public static void interleaveHalves(Queue<Integer> q){
        int n = q.size();

        Queue<Integer> q2  = new LinkedList<>();
        for(int i = 0; i<n/2; i++){
            q2.add(q.remove());
        }
        for(int i = 0; i<n/2; i++){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> nums = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        interleaveHalves(nums);
        System.out.println(nums);
    }
}