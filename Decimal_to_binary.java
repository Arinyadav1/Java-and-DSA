import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Decimal Number = ");
        int decNum = sc.nextInt();
        System.out.println( "Binary Number of " +decNum +" = " +decimalToBinary(decNum));
    } public static String decimalToBinary(int decNum) {
        String finalBinary = "";
        while (decNum != 0) {
            int binary = decNum % 2;
            decNum = decNum / 2;
            String reverbinary = Integer.toString(binary);
            finalBinary = reverbinary + finalBinary; // for reverse number
        }
        return finalBinary;
        
    }
}
