import java.util.ArrayList;

public class Bellman_Ford_Algorithm {
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
    graph[0].add(new Edge(0, 1, 2));
    graph[0].add(new Edge(0, 2, 4));

    // for 1 vertex
    graph[1].add(new Edge(1, 2, -4));
    

    // for 2 vertex
    graph[2].add(new Edge(2, 3, 2));
    
    // for 3 vertex
    graph[3].add(new Edge(3, 4, 4));

    // for 3 vertex
    graph[4].add(new Edge(4, 1, -1));
}

public static void bellmanFordAlgorithm(ArrayList<Edge> graph[], int src, int V){
    int distance[] = new int[V];
    for(int i = 0; i < V; i++){
        if(i != src){
            distance[i] = Integer.MAX_VALUE;
        }
    }

    for(int k = 0; k < V-1; k++){
        for(int j = 0; j < V; j++){
            for(int i = 0; i < graph[j].size(); i++){
                Edge e = graph[j].get(i);
                int u = e.src;
                int v = e.destination;

                if(/*distance[u] != Integer.MAX_VALUE &&*/ distance[v] > distance[u] + e.weight){
                    distance[v] = distance[u] + e.weight;
                }
            }
        }
    }

    for(int j = 0; j < V; j++){
        for(int i = 0; i < graph[j].size(); i++){
            Edge e = graph[j].get(i);
            int u = e.src;
            int v = e.destination;

            if(/*distance[u] != Integer.MAX_VALUE &&*/ distance[v] > distance[u] + e.weight){
                System.out.println("Negative Weight Cycle");
            }
        }
    }

    for (int i = 0; i < V; i++){
        System.out.print(distance[i] +" ");
    }
    System.out.println();
    
}

    public static void main(String[] args) {
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        bellmanFordAlgorithm(graph, 0, V);
    }
}
