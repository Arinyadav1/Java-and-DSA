
public class Exception {
    public static void main(String[] args) {
        //Try-Catch
        //Finally
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block");
        }

        //Throw
        try {
            int a = 10;
            int b = 0;
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        //Throws
        try {
            int a = 10;
            int b = 0;
            divide(a, b);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
            
                    
  }
            
                private static void divide(int a, int b) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'divide'");
                }
}
