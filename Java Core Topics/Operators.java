
public class Operators {
    public static void main(String[] args) {
        // Operators
        int a = 4;
        int b = 5;
        int c = 10;
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));

        // Relational Operators
        System.out.println("Relational Operators");
        System.out.println("a < b = " + (a < b));

        // Logical Operators
        System.out.println("Logical Operators");
        System.out.println("a < b && a > 2 = " + (a < b && a > 2));

        // Bitwise Operators
        System.out.println("Bitwise Operators");
        System.out.println("a & b = " + (a & b));

        // Assignment Operators
        System.out.println("Assignment Operators");
        c += 5;
        System.out.println("a += 5 = " + c);

        // Conditional Operators
        System.out.println("Conditional Operators");
        System.out.println("a > b ? a : b = " + (a > b ? a : b));

        // Unary Operators
        System.out.println("Unary Operators");
        System.out.println("a++ = " + a++);
        System.out.println("++a = " + ++a);

        // Shift Operators
        System.out.println("Shift Operators");
        System.out.println("a << 1 = " + (a << 1));

        // Ternary Operator
        System.out.println("Ternary Operator");
        System.out.println("a > b ? a : b = " + (a > b ? a : b));
    }
}
