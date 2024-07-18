import java.util.Scanner;

public class Power_by_logn {
    public static void main(String[] args) {
        // this program work on x^n for log n stack height
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        System.out.print("Enter Power = ");
        int power = sc.nextInt();
        System.out.println(printXPowerNth(num, power));
    }
    public static int printXPowerNth(int n, int p) {
        if (p == 0){
            return 1 ;
        }
        int pValue = printXPowerNth(n, p/2) * printXPowerNth(n, p/2);
        if (p % 2 == 1){
            pValue = pValue * n;
        }
        return pValue;
    }
}
