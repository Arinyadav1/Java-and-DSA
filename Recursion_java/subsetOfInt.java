import java.lang.reflect.Array;
import java.util.ArrayList;

public class subsetOfInt {
    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        subsetOfNthNumberInteger(3, subset);
        
    }
    public static void printSubsetOFInt(ArrayList<Integer> subset) {
        for(int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i)+ " ");
        }
        System.out.println();
        
    }
    public static void subsetOfNthNumberInteger(int num, ArrayList<Integer> subset) {
        if(num == 0){
            printSubsetOFInt(subset);
            return;
        }
        subset.add(num);
        subsetOfNthNumberInteger(num-1, subset );
        subset.remove(subset.size()-1);
        subsetOfNthNumberInteger(num -1 , subset);
    }
}
