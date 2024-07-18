import java.util.Scanner;

public class Find_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Data Limit = ");
        int d = sc.nextInt();
        int [] large = new int[d];
        for (int i = 0; i < d; i++){
            large[i] = sc.nextInt();
        }
        int max = large[0];
        for (int i = 0; i < d; i++){
            if (max < large[i]){
                max = large[i];
            }
        }
        System.out.println(max +" Large");
    }
}
