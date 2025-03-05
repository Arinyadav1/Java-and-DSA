import java.util.ArrayList;

public class Bridge_Graph {
    static class Edge{
        int src, destination;

        public Edge(int s, int d){
            this.src = s;
            this.destination = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));
    }


    // TARJAN'S ALGORITHMS
    public static void bridge(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;

        boolean vis[] = new boolean[V];

        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                depthFirstSearch(graph, i, vis, dt, low, time, -1);
            }
        }

    }

    public static void depthFirstSearch(ArrayList<Edge> graph[], int curr, boolean visted[], int dt[], int low[], int time, int parent){

        visted[curr] = true;
        dt[curr] = low[curr] = ++time;  

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(e.destination == parent){
                continue;

            } else if(visted[e.destination] == false){
                depthFirstSearch(graph, e.destination, visted, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.destination]);
                if(dt[curr] < low[e.destination]){
                    System.out.println("Bridge is "+ e.src +" ------- " +e.destination);
                }
            } else
            {
                low[curr] = Math.min(low[curr], dt[e.destination]);
            }
        }
        
    }


    public static void main(String[] args) {
        int v = 5;
      
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        createGraph(graph);

        boolean visted[] = new boolean[graph.length];
        
        // it is for connected components
        // depthFirstSearch(graph, 0, visted2);


        // it is for Disconnected Components
       bridge(graph, v);

    }
}
