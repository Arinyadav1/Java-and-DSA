import java.util.*;
public class Und_Unw_AdjList {
    static class Edge {
    int src;
    int destination;
    int weight;

    public Edge(int s, int d, int w){
        this.destination = d;
        this.src = s;
        this.weight = w;
    }
}
public static void createGraph(ArrayList<Edge> graph[]){
    for(int i =0; i < graph.length; i++){
        graph[i] = new ArrayList<>();
    }

    // for 0 vertex
    graph[0].add(new Edge(0, 2, 2));

    // for 1 vertex
    graph[1].add(new Edge(1, 2, 10));
    graph[1].add(new Edge(1, 3, 0));

    // for 2 vertex
    graph[2].add(new Edge(2, 0, 2));
    graph[2].add(new Edge(2, 1, 10));
    graph[2].add(new Edge(2, 3, -1));

    // for 3 vertex
    graph[3].add(new Edge(3, 1, 0));
    graph[3].add(new Edge(3, 2, -1));
    
    
}
    public static void main(String[] args) {
        int V = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        for (int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.err.println("Source "+e.src +" ----- Destination " +e.destination +" = "+e.weight);
        }
    }
}
