
import java.util.PriorityQueue;

public class H05ConnectNRopes{
    
    public static int minCostToConnect(int[] ropes){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }

        int curr_cost;
        int cost = 0;
        while(pq.size()>1){
            curr_cost = pq.remove() + pq.remove();
            pq.add(curr_cost);
            cost += curr_cost;
        }

        return cost;
    }
    public static void main(String[] args) {
        int[] ropes = {2,3,3,4,6};
        System.out.println(minCostToConnect(ropes));
    }
}