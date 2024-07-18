import java.util.Scanner;

public class Sort_Asend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Data Limit = ");
        int v = sc.nextInt();
        int asending [] = new int[v];
        for (int i = 0; i < v; i++){
            asending[i] = sc.nextInt();
        }
        for (int i = 0; i < v; i++){
            for (int j = (i + 1); j < v; j++){
                if (asending[i] > asending[j]){
                    int a = asending[i];
                    asending[i] = asending[j];
                    asending [j] = a;
                }
            }
        }
        for (int i = 0; i < v; i++){
            System.out.print(asending[i] +" ");
        }
    }
}
