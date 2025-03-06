import java.util.ArrayList;
import java.util.Collections;
public class Use_ArrayList {
    /*
      ArrayLists are dynamic and resizable collections of elements.
      Here are some method for use ArrayList
      get(index)
      set(index, value)
      remove(index)
      clear()
      size()
      add(value)
     */
    public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<Integer>();
  
    // add element
    num.add(2); 
    num.add(4); 
    num.add(1); 
    num.add(3); 
    System.out.println(num);

    // get element 
    int value = num.get(2);
    System.out.println(value);

    // add element in particular index
    num.add(2, 5);
    System.out.println(num);

    // set element
    num.set(3, 0);
    System.out.println(num);

    // size of ArrayList
    int length = num.size();
    System.out.println(length);

    // remove / delete elemet
    num.remove(1);
    System.out.println(num);

    // loops on array
    for(int i = 0; i < num.size(); i++){
      System.out.println(num.get(i));
    }
    System.out.println();

    // sort by using Collection class
    Collections.sort(num);
    System.out.println(num);


    }
}
