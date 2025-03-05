public class Function {
    public static void main(String[] args) {
        // Function
        /* In java we call method instead of functions due to the term "method" is used instead of 
        "function" because Java is an object-oriented programming language. Methods are functions 
        that are associated with objects or classes. They define the behavior of the objects and 
        how they interact with each other.
        */
        int a = 5;
        int b = 10;
        int result = add(a, b);
        System.out.println(result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}