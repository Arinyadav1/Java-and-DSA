import java.util.*;
public class Problem{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //add element in default last
        list.add("is");
        list.add("my");
        list.add("program");
        System.out.println(list);

        // add element in last 
        list.addLast("Java");
        System.out.println(list);

        // add element in specific index
        list.add(3, "of");
        System.out.println(list);

        // add element in first of the list
        list.addFirst("This");
        System.out.println(list);
        
        // method of find size of the list
        int length = list.size();
        System.out.println(length);
        

        //get elemet from the string
        for(int i = 1; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // delete first element from the list
        list.removeFirst();
        System.out.println(list);

        // delete last element from the list
        list.removeLast();
        System.out.println(list);

    }    
}