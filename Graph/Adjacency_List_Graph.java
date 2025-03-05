import java.util.*;

// undirected unweighted graph
public class Adjacency_List_Graph{
    static class Edge{
        int src;
        int destination;

        public Edge(int s, int d){
            this.src = s;
            this.destination = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        // for 0 vertex
        graph[0].add(new Edge(0, 2));

        // for 1 vertex
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        // for 2 vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        // for 3 vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // 3 vertex neighbours
        for(int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.err.println(e.destination);
        }
        
    }
}