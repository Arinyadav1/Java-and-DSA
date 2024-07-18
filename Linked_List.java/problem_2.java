import java.util.LinkedList;
import java.util.Scanner;
public class problem_2 {
// Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    LinkedList<Integer> list = new LinkedList<>();
    System.out.println("Enter the List Value");
    for(int i = 1; i <= 10; i++){
        int value = sc.nextInt();
        list.add(value);
    }
    System.out.println(list);
    deleteElements(list);

}
public static void deleteElements(LinkedList<Integer> list) {
    for(int i = 1; i < list.size(); i++){
        if(list.get(i) > 25){
            list.remove(i);
        }
    }
    System.out.println(list);
}
}
