import java.util.*;
public class Reverse_Stack {
    public static void pushAtBottom(int data, Stack<Integer> Stack) {
        if(Stack.isEmpty()){
            Stack.push(data);
            return;
        }
        int top = Stack.pop();
        pushAtBottom(data, Stack);
        Stack.push(top);
    }
    public static void reverse(Stack<Integer> Stack) {
        if(Stack.isEmpty()){
            return;
        }
        int top = Stack.pop();
        reverse(Stack);
        pushAtBottom(top, Stack);
    }
    public static void main(String [] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
