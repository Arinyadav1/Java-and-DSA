import java.util.Scanner;

public class Sum_Nth_Natural_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth Number = ");
        int n = sc.nextInt();
        sumNthNaturalNumber(n, 1, 0);
    }
    public static void sumNthNaturalNumber(int n, int i, int sum){
        if(i == (n + 1)){
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNthNaturalNumber(n, i + 1, sum);
    }
}
