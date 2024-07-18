import java.util.ArrayList;
import java.util.List;
public class error {
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> help = new ArrayList<>();
        temp.add(1);
        System.out.println(temp);
        temp.add(2);
        System.out.println(temp);
        temp.add(3);
        System.out.println(temp);
        temp.add(4);
        System.out.println(temp);
        temp.add(5);
        System.out.println(temp);
        
        System.out.println(new ArrayList<Integer>(temp));
        help.add(new ArrayList<Integer>(temp));
        System.out.println(help);
        
    }
}
