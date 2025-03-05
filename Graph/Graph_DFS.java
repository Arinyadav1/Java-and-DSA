import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("unused")
public class Graph_DFS {
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void depthFirstSearch(ArrayList<Edge> graph[], int curr, boolean visted[]){
        System.out.print(curr +" ");
        visted[curr] = true;  

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(visted[e.destination] == false){
                depthFirstSearch(graph, e.destination, visted);
            }
        }
        
    }


    public static void main(String[] args) {
        int v = 7;
        /*
         
           1----3  
          /     | \ 
         0      |  5-----6 
          \     | /
           2----4 


         */
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        createGraph(graph);

        boolean visted[] = new boolean[graph.length];
        
        // it is for connected components
        // depthFirstSearch(graph, 0, visted2);


        // it is for Disconnected Components
        for(int i = 0; i < v; i++){
            if(visted[i] == false){
                depthFirstSearch(graph, i, visted);
            }
        }

    }
}
