import java.util.Scanner;

public class Print_x_power_nth {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        System.out.print("Enter Power = ");
        int power = sc.nextInt();
        printXPowerNth(num, power, 1);

    }
    public static void printXPowerNth(int n, int p, int sum) {
        if(p == 1){
            sum = sum * n;
            System.out.println(sum);
            return;
        }
       sum = sum * n;
       printXPowerNth(n, p - 1, sum);
    }
}
