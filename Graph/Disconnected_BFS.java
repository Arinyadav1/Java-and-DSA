import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Disconnected_BFS {
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
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 6));

        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 7));

        graph[6].add(new Edge(6, 4));
        graph[6].add(new Edge(6, 7));

        graph[7].add(new Edge(5, 5));
        graph[7].add(new Edge(6, 6));
    }

    public static void breathFirstSearch(ArrayList<Edge> graph[], boolean visted[], int start){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()){
            int curr = queue.remove();

            if(visted[curr] == false){
                System.out.print(curr +" ");
                visted[curr] = true;

                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    queue.add(e.destination);
                }
            }
        }
    }


    public static void main(String[] args) {
        int v = 8;

        // Disconnected Component
        /*

            1         
           / \
          0   3
           \ /
            2

            5         
           / \
          4   7
           \ /
            6  
            
        */
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        createGraph(graph);

        for(int i = 0; i < graph[3].size(); i++){
            Edge e = graph[3].get(i);
            System.out.println(e.destination);
        }
        boolean visted[] = new boolean[graph.length];
        for(int i = 0; i < v; i++){
            if(visted[i] == false){
                breathFirstSearch(graph, visted, i);
            }
        }
    }
}
