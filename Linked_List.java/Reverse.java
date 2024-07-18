import java.util.LinkedList;
public class Reverse{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i <= 20; i++){
            list.add(i);
        }
        System.out.println(list);
        
        int j = 0;
        for(int i = list.size(); i >= 1; i--, j++){
            list.remove(j);
            list.add(j, i);
        }
        System.out.println(list);
    }
}
