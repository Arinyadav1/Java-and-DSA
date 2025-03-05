import java.lang.reflect.Array;
import java.util.*;

@SuppressWarnings("unused")
public class Edge_List {

    static class Edge{
        int src;
        int destination;
        int weight;

        public Edge(int s, int d, int w){
            this.src = s;
            this.destination = d;
            this.weight = w;
        }
    }
    private static void creatGraph(ArrayList<Edge> list) {
        list.add(new Edge(0,2,2));
        list.add(new Edge(1,2,10));
        list.add(new Edge(1,3,0));
        list.add(new Edge(2,3,-1));
    }


    public static void main(String[] args) {
        ArrayList<Edge> list = new ArrayList<>();
        creatGraph(list);


        System.out.print("{");
        for(int i = 0; i < list.size(); i++){
            System.out.print("{ "+list.get(i).src +", " + list.get(i).destination+", " +list.get(i).weight +" },");
        }
        System.out.println("}");
        
    
    }
    
}
