

public class Type_Casting {
    public static void main(String[] args) {
        // Type Casting 
        System.out.println("Implicit Type Casting");
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);

        // Explicit Type Casting
        System.out.println("\n \nExplicit Type Casting");
        double d = 100.04;
        long l1 = (long) d;
        int i1 = (int) l1;
        System.out.println("Double value " + d);
        System.out.println("Long value " + l1);
        System.out.println("Int value " + i1);
    }
    
}
