import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Calculate factorial using recursion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth Number = ");
        int n = sc.nextInt();
       
        System.out.println(calculateFactorial(n));
    }
    public static int calculateFactorial(int n) {
        if(n == 1 || n == 0){
            return 1 ; //base condition
        }
        int nthNumber = calculateFactorial(n-1); 
        int factorial = n * nthNumber; 
        return factorial; 
    }
}
