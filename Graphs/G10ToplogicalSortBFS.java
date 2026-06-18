
import java.util.*;

public class G10ToplogicalSortBFS{
    @SuppressWarnings("unused")
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }


    static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));

        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));
                
    }

    private  static void calculateInDeg(ArrayList<Edge>[] graph, int[] indeg){

        for (ArrayList<Edge> graph1 : graph) {
            for (int j = 0; j < graph1.size(); j++) {
                Edge e = graph1.get(j);
                indeg[e.dest]++;
            }
        }

    }

    private  static void topSort(ArrayList<Edge>[] graph){
        
        //calculate in-degree
        int[] indeg = new int[graph.length];
        calculateInDeg(graph, indeg);

        //Create Queue and Add indeg - 0 
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<indeg.length; i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;

                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }

        }

        System.out.println("");
        
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topSort(graph);
    }
}