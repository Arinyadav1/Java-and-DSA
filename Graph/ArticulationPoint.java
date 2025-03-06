import java.util.ArrayList;

public class ArticulationPoint {
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

    public static void articulationPoint(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        boolean ap[] = new boolean[V];
        

        boolean vis[] = new boolean[V];

        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                depthFirstSearch(graph, i, vis, dt, low, ap, -1, 0);
            }
        }

        System.out.println("Articulation point");
        for(int i = 0; i < V; i++){
            if(ap[i] == true){
                System.out.println(i);
            }
        }

    }

    public static void depthFirstSearch(ArrayList<Edge> graph[], int curr, boolean visted[], int dt[], int low[], boolean ap[], int parent, int time){

        visted[curr] = true;
        dt[curr] = low[curr] = ++time;  
        int children = 0;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(e.destination == parent){
                continue;

            } else if(visted[e.destination] == false){
                depthFirstSearch(graph, e.destination, visted, dt, low, ap, curr, time);
                low[curr] = Math.min(low[curr], low[e.destination]);
                if(dt[curr] <= low[e.destination] && parent != -1){
                    ap[curr] = true;
                }
                children++;
            } else
            {
                low[curr] = Math.min(low[curr], dt[e.destination]);
            }
        }

        if(parent == -1 && children > 1){
            ap[curr] = true; 
        }
        
    }


    public static void main(String[] args) {
        int v = 5;
      
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        createGraph(graph);

        // boolean visted[] = new boolean[graph.length];
        
        // it is for connected components
        // depthFirstSearch(graph, 0, visted2);


        // it is for Disconnected Components
       articulationPoint(graph, v);

    }
}
