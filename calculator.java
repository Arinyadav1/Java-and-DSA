import java.util.*;
public class calculator {
    public static void main(String [] argu){
        Scanner sc = new Scanner (System.in);
        System.out.println("( Calculator )");
        System.out.print("Enter First Number = ");
        int a = sc.nextInt();
        System.out.print("Enter Function ( + , - , % , * , / ) = ");
        char function = sc.next().charAt(0);
        System.out.print("Enter Second Number = ");
        int b = sc.nextInt();
        System.out.print("Answer = " );

        switch(function){
            case '+' : System.out.println(a + b);
            break;
            case '-': System.out.println(a - b);
            break;
            case '/' : if (b == 0) {
                System.out.println("valune can not define");
            } else {
                System.out.println( a / b);
            }
            break;
            case '%' : if (b == 0) {
                System.out.println("valune not define");
            } else {
                System.out.println(a % b);
            }
            break;
            case '*' : System.out.println( a * b);
            break;
            default : System.out.println("Undefiend Value");
        }
        

    }
}
