import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        // country (Key), popullation (value)
        HashMap<String, Integer> map = new HashMap<>();
        
        // map.put(key, value)
        // map.containsKey(args)
        // map.get(args)
        // map.remove(args)
        // map.entrySet()
        // map.keySet()
        // e.getKey();
        // e.getValue()

        // Insert 
        map.put("India", 140);
        map.put("China", 139);
        map.put("US", 60);
        map.put("Russia", 50);
        map.put("Canada", 40);
        map.put("US", 70);

        //print map
        System.out.println(map);

        //search
        if(map.containsKey("Us")){
            System.out.println(map.get("US"));
        } else {
            System.out.println("not contain");
        }

        // get keys value
        System.out.println(map.get("China")); // exist 
        System.out.println(map.get("Pakistan ")); // not exist
        System.out.println();

        // 1st Type Itrator
        for(Map.Entry<String, Integer> it : map.entrySet()){
            System.out.println(it.getKey());
            System.out.println(it.getValue());
        }

        // 2nd Type Itrator
        Set<String> Keys = map.keySet();
        for(String Key : Keys){
            System.out.println(Key +" " + map.get(Key));
        }

        //remove
        map.remove("China");
        System.out.println(map);



    }
}
