import java.util.ArrayList;

public class Cycle_Detection {
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

        // graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
       
    }

    public static boolean cycleDetection(ArrayList<Edge> graph[], int curr, boolean visted[], boolean recursionArray[]){
        visted[curr] = true;
        recursionArray[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(recursionArray[e.destination]){
                return true;
            }
            else if(visted[e.destination] == false){
                if(cycleDetection(graph, e.destination, visted, recursionArray)){
                    return true;
                }
            }
        }
        recursionArray[curr] = false;
        return false;
        
    }


    public static void main(String[] args) {
        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        createGraph(graph);

        boolean visted[] = new boolean[graph.length];
        boolean recursionArray[] = new boolean[graph.length];
        for(int i = 0; i < v; i++){
            if(visted[i] == false){
                boolean cycle = cycleDetection(graph, i, visted, recursionArray);
                if(cycle){
                    System.out.println(cycle);
                    break;
                }
                else{
                    System.out.println(false);
                    break;
                }
            }
        }
      
       

    }
}
