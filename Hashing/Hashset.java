import java.util.*;
public class Hashset{
    public static void main(String [] args){
        //it store unique value means no dublicates value allow.
        HashSet<Integer> set = new HashSet<>();

        // set.add() 
        // set.contains(args)
        // set.remove(args)
        // it.hasNext()
        // it.next()

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);

        //print set
        System.out.println(set);

        //size
        System.out.println("Size of Set " +set.size());

        //search
        if(set.contains(1)){
            System.out.println("YES contain");
        }
        if(!set.contains(6)){
            System.out.println("Not Contain");
        }

        //delete
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("Not Contain");
        }

        // iterator in hashset
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}