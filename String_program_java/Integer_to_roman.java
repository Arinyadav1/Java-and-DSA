import java.util.Scanner;

public class Integer_to_roman {
    public static void main(String[] args) {
        // Converting Decimal Number lying between 1 to 3999 to Roman Numerals
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Value = ");
        int value = sc.nextInt();
        System.out.println( integerToRoman(value));
    } public static String integerToRoman(int value){
        StringBuilder sb = new StringBuilder();
        while (value != 0){
            if (value >= 1000){
                value = value - 1000;
                sb.append("M");
            } else if (value >= 900){
                value = value - 900;
                sb.append("CM");
            } else if (value >= 500){
                value = value - 500;
                sb.append("D");
            } else if (value >= 400){
                value = value - 400;
                sb.append("CD");
            } else if (value >= 100){
                value = value - 100;
                sb.append("C");
            } else if (value >= 90){
                value = value - 90;
                sb.append("XC");
            } else if (value >= 50){
                value = value - 50;
                sb.append("L");
            } else if (value >= 40){
                value = value - 40;
                sb.append("XL");
            } else if (value >= 10){
                value = value - 10;
                sb.append("X");
            } else if (value >= 9){
                value = value - 9;
                sb.append("IX");
            } else if (value >= 5){
                value = value - 5;
                sb.append("V");
            } else if (value >= 4){
                value = value - 4;
                sb.append("IV");
            } else {
                value = value - 1;
                sb.append("I");
            }
        }
        return sb.toString(); 
    }
}
