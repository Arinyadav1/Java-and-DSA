import java.util.Scanner;

public class Toggle_a_bit {
    @SuppressWarnings("resource")
    public static void main (String [] arg){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number = ");
        int number = sc.nextInt();
        System.out.print("Enter Position from right to left = ");
        int pos = sc.nextInt();
        int Bitmask = 1 << pos - 1;
        int finalValue = Bitmask ^ number;
        System.out.println(finalValue);
    }
}
