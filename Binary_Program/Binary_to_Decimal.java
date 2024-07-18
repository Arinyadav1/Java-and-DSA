import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main (String args []){
        // convert binary number to decimal number
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter Binary Number = ");
        long binaryNumber = sc.nextLong();
        System.out.println(convertBinaryToDecimalNumber(binaryNumber));
    }
    public static int convertBinaryToDecimalNumber(long binaryNumber) {
       String number = Long.toString(binaryNumber);
       int squareOFTwo = 1;
       int decimalNumber = 0;
        for(int i = 0; i < number.length() ; i++){
            char ch = number.charAt(i);
            int binarryDigits = Character.getNumericValue(ch);  
            for(int j = number.length()-(i+1); j> 0; j--){
                squareOFTwo = squareOFTwo * 2;
            }
            decimalNumber = decimalNumber + (binarryDigits * squareOFTwo);
            squareOFTwo = 1;
        }
        return decimalNumber;
    }
}
