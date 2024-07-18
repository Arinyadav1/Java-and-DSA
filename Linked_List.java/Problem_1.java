import java.util.*;
public class Problem_1 {
    //Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) == 7){
                System.out.println("Index " +(i+1) +" of element " );
            }
        }
    }
}
