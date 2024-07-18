import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
    static  class HashMap<K, V>{
        private class Node{
             K key;
             V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
             }

        }
        private int n; // node
        private int N; // buckets
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }


        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0; i < oldBucket.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private int hashFunction(K key){ 
            int bi = key.hashCode();
            // 63772   -63772
            return Math.abs(bi) % N;
        }
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){// not exsist
                buckets[bi].add(new Node(key, value));
                n++;
            }else{ // exsist
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;

            if(lambda > 2.0){
                rehash();
            }
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){// not exsist
                return null;
            }else{ // exsist
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){// not exsist
                return false;
            }else{ // exsist
                return true;
            }
        }
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){// not exsist
                return null;
            }else{ // exsist
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public boolean isEmpty(){
            return n == 0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i < buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++){
                    keys.add(ll.get(j).key);
                } 
            }
            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Arin", 19);
        map.put("Muskan", 16);
        map.put("Riya", 10);
        map.put("Rohan", 8);
        ArrayList<String> keys = map.keySet();
        for(int i = 0; i < keys.size(); i++){
            System.out.println(keys.get(i)+ ", " +map.get(keys.get(i)));
        }

        System.out.println(map.isEmpty());
        System.out.println(map.remove("Arin"));
    }
}
