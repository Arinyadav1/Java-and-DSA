import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the nth Number = ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        printFibonacciSeries(num-2, a, b);
        sc.close();
    }
    public static void printFibonacciSeries(int n, int a, int b) {
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacciSeries(n-1, b, c); 
    }
}
