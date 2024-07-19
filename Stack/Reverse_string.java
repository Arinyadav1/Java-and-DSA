import java.util.*;
public class Reverse_string {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Arin Yadav");
        reverseString(str);
        System.out.print(str);
        
    }
    public static void reverseString(StringBuffer str) {
        Stack<Character> reverse = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            reverse.push(str.charAt(i));
        }
        str.delete(0, str.length());
        while (!reverse.isEmpty()) {
            str.append(reverse.peek());
            reverse.pop();
        }
    }
}
 
