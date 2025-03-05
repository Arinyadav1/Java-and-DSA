import java.util.*;
import java.lang.*;;
public class Dijkstra_Algorithms{ 
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
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
    
        // for 2 vertex
        graph[2].add(new Edge(2, 4, 3));
    
        // for 3 vertex
        graph[3].add(new Edge(3, 5, 1));

        // for 4 vertex
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        // for 5 vertex
        graph[5].add(new Edge(5, 5, 0));
    
        
        
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int distance;

        public Pair(int n, int d){
            this.distance = d;
            this.node = n;
        }

        @Override
        public int compareTo(Pair p2){
            return this.distance - p2.distance;
        }
    
    }



    // O(E + ElongV)
    public static void dijkstraAlgorithms(ArrayList<Edge> graph[], int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int distance[] = new int[V];
        for(int i = 0; i < V; i++){
            if(src != i){
            distance[i] = Integer.MAX_VALUE;
            }
        }
        boolean visited[] = new boolean[V];
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove(); //it gives shortes element because it is priority queue
            
            if(visited[curr.node] == false){
                visited[curr.node] = true;

                for(int i = 0; i < graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);

                    int u = e.src;
                    int v = e.destination;

                    if(distance[v] > distance[u] + e.weight){
                        distance[v] = distance[u] + e.weight;
                        pq.add(new Pair(v, distance[v]));
                    }
                }
            }
        }

        for (int i = 0; i < V; i++){
            System.out.print(distance[i] +" ");
        }
        System.out.println();
        
    }


        public static void main(String[] args) {
            int V = 6;
    
            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[] = new ArrayList[V];
            createGraph(graph);

            dijkstraAlgorithms(graph, 0, V);
    
            
        }       
}
