
import java.util.*;

public class G11AllPaths{
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

        graph[0].add(new Edge(0,3));
        
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));

        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));
                
    }

    private static void allPaths(ArrayList<Edge>[] graph, int start, int target){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(start);

        allPathsUtility(graph, start, target, res);
    }

    private static void allPathsUtility(ArrayList<Edge>[] graph, int start, int target, ArrayList<Integer> path){
        if(start == target){
            System.out.println(path);
            return;
        }
        for(int i = 0; i<graph[start].size();i++){
            Edge e = graph[start].get(i);
            int src = e.dest;
            path.add(src);
            allPathsUtility(graph, src, target, path);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        allPaths(graph, 5, 1);

    }
}