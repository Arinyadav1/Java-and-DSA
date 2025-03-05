import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
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

        graph[0].add(new Edge(0, 0));
        

       
        graph[1].add(new Edge(1, 1));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[5].add(new Edge(5, 0));
    }

    public static void topologicalSorting(ArrayList<Edge> graph[], int curr, boolean visted[], Stack<Integer> addElement){

        visted[curr] = true;  
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(visted[e.destination] == false){
                topologicalSorting(graph, e.destination, visted, addElement);
            }
        }
        addElement.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        boolean visted[] = new boolean[graph.length];
        Stack<Integer> addElement = new Stack<>();
        for(int i = 0; i < graph.length; i++){
            if(visted[i] == false){
                topologicalSorting(graph, i, visted, addElement);
            }
        }

        while (!addElement.empty()) {
            System.out.print(addElement.peek());
            addElement.pop();
        }
    }


    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        createGraph(graph);
        topSort(graph);

        

    }
}