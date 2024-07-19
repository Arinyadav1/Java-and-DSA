import java.util.Stack;

public class Balance_brackets {
    public static boolean checkBrackets(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch  == '['){
                stack.push(ch);
            } else {
                char openBrack = stack.peek();
                if((openBrack == '(' && ch == ')') || (openBrack == '{' && ch == '}') || (openBrack == '[' && ch == ']')){
                stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main (String [] args){
        String str = "[ {}]";
        if(checkBrackets(str)){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
