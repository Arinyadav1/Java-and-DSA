import java.util.*;
public class PushAtBottom {
    public static void pushAtBottom(int data, Stack<Integer> Stack){
        if(Stack.isEmpty()){
            Stack.push(data);
            return;
        }
        int top = Stack.pop();
        pushAtBottom(data, Stack);
        Stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushAtBottom(5, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
