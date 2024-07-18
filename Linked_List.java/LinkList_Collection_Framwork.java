import java.util.Collections;
import java.util.LinkedList;

public class LinkList_Collection_Framwork {
    public static void main(String[] args) {
        LinkedList<Integer> list2 = new LinkedList<>();
       for(int i = 1; i <= 10; i++){
       list2.add(i);
       }
       System.out.println(list2);
       Collections.reverse(list2);
       System.out.println(list2);
    }
}
