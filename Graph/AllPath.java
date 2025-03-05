import java.util.*;
public class AllPath {
    // All Path from Source to Destination

    static class Edge{
        int src, destination;

        public Edge(int s, int d){
            this.src = s;
            this.destination = d;
        }
    }

    static class Distance{
        String value; 
        int key;

        public Distance(String value, int key){
            this.value = value;
            this.key = key;
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

    // static HashMap<Integer, String> distMap = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> length = new ArrayList<>();
    
    public static void printAllPath(ArrayList<Edge> graph[], int curr, boolean visted[], String path, int taget){
       if(curr == taget){
        list.add(Integer.parseInt(path));
        length.add(path.length());
        System.out.print(path +", ");
        return;
       }

       for(int i = 0; i < graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        
        if(visted[e.destination] == false){
            visted[curr] = true;
            printAllPath(graph, e.destination, visted, path+e.destination, taget);
            visted[curr] = false;
        }
       }
    }
    
    public static void shortestDistance() {
         Collections.sort(length);
         Collections.sort(list);

         int sameLength = 0;
        for(int i = 0; i < length.size(); i++){
            if(length.get(0) == length.get(i)){
                sameLength++;
            }
        }

        System.out.println();
        for(int i = 0; i < sameLength; i++){
            System.out.println("0"+list.get(i));
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
        int src = 0;
        int taget = 6;
        
        printAllPath(graph, src, visted, "0", taget);
        shortestDistance();

    }
}
