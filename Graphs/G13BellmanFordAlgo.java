import java.util.*;

public class G13BellmanFordAlgo {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) { //Edge[]
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    private  static void bellmanFord(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];
        for(int i = 0; i<dist.length; i++){
            if( i != src){
                dist[i] = Integer.MAX_VALUE;                
            }            
        }
        int V = graph.length;
        //Algo
        for(int i = 0; i<V-1; i++){
            //edges
            for (ArrayList<Edge> graph1 : graph) {
                for (int k = 0; k < graph1.size(); k++) {
                    Edge e = graph1.get(k);
                    //u,v,wt
                    int u = e.src;
                    int v= e.dest;
                    int wt = e.wt;
                    //relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        //print all source to dist paths
        for(int i = 0 ; i<dist.length; i++){
            System.out.println(src + " --> " + i + " = " + dist[i]);
        }
    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0);
    }
}