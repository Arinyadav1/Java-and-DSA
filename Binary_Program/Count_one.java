import java.util.Scanner;

public class Count_one {
    public static void main(String[] args) {
        // program to count the number of 1’s in a binary representation of the number
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Binary Number = ");
        long number = sc.nextLong();
        int count = 0;
        while(number != 0){
            if(number % 10 == 1){
                count = count + 1;
            }
            number = number / 10;
        }
        System.out.println("Number of 1 = " +count);
    }
}
