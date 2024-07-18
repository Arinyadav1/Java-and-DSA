import java.util.Scanner;

public class Find_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Data Limit = ");
        int d = sc.nextInt();
        int [] large = new int[d];
        for (int i = 0; i < d; i++){
            large[i] = sc.nextInt();
        }
        int min = large[0];
        for (int i = 0; i < d; i++){
            if (min > large[i]){
                min = large[i];
            }
        }
        System.out.println(min +" Smallest");
    }
}
