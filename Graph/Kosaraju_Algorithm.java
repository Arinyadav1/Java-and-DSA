import java.util.*;

public class Kosaraju_Algorithm {
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
        graph[0].add(new Edge(0, 3));

        // for 1 vertex
        graph[1].add(new Edge(1, 0));

        // for 2 vertex
        graph[2].add(new Edge(2, 1));

        // for 3 vertex
        graph[3].add(new Edge(3, 4));

    }
    public static void topologicalSorting(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> addElement) {
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(vis[e.destination] == false){
                topologicalSorting(graph, e.destination, vis, addElement);
            }
        }

        addElement.push(curr);

    }

    public static void depthFirstSearch(ArrayList<Edge> graph[], int curr, boolean visted[]){
        
        visted[curr] = true; 
        System.out.print(curr +" "); 

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(visted[e.destination] == false){
                depthFirstSearch(graph, e.destination, visted);
            }
        }
        
    }

    public static void kosaraju(ArrayList<Edge> graph[], int V) {
        
        //step 1
        boolean vis[] = new boolean[V];
        Stack<Integer> addElement = new Stack<>();
        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                topologicalSorting(graph, i, vis, addElement);
            }
        }

        //step 3
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i = 0; i < V; i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i < V; i++){
            for(int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j);
                transpose[e.destination].add(new Edge(e.destination, e.src));
            }
        }


        //step3
        while (!addElement.isEmpty()) {
            int curr = addElement.pop();
            if(!vis[curr]){
                depthFirstSearch(transpose, curr, vis);
                System.out.println();
            }
            
            
        }


        
    }
    
    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        kosaraju(graph, V);

        
        
    }
}