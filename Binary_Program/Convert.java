import java.util.*;
public class Convert {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Decimal Number for Conver In Binary = ");
        int decimal = sc.nextInt();
        decimalToBinary(decimal);
    } public static void decimalToBinary(int decimal){
        StringBuilder sb = new StringBuilder();
        String reverse = "";
        while (decimal != 0){
           int bValue  = decimal % 2;  
           String str = Integer.toString(bValue);
           decimal = decimal / 2;
           sb.append(str);
           reverse = str + reverse;
        }
        System.out.println(reverse);
    }
}
