import java.util.*;
public class Power_of_2 {
    public static void main(String[] args) {
        // find if a number is a power of 2 or not
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number = ");
        int number = sc.nextInt();
        if ((number & (number - 1)) == 0) {
            System.out.println("Yes number " +number +" is power of 2");
        } else {
            System.out.println("Not number " +number +" is not power of 2");
        }
    }
}
