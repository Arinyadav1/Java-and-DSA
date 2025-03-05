import java.util.*;
public class Prims_Algoritham{
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        
        // for 1 vertex
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
    
        // for 2 vertex
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
    
        // for 3 vertex
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50)); 
    }


    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int n, int c){
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    
    }



    
    public static void primsAlgoritham(ArrayList<Edge> graph[], int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[V];
        pq.add(new Pair(0, 0));

        int mstCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove(); //it gives shortes element because it is priority queue
            
            if(visited[curr.node] == false){
                visited[curr.node] = true;

                mstCost += curr.cost;

                for(int i = 0; i < graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    if(visited[e.destination] == false){
                        pq.add(new Pair(e.destination, e.weight));
                    }
                }
            }
        }

       System.out.println(mstCost);
        
    }


        public static void main(String[] args) {
            int V = 4;
    
            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[] = new ArrayList[V];
            createGraph(graph);
            primsAlgoritham(graph, 0, V);    
            
        }       
}