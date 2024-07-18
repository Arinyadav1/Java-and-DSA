import java.util.Scanner;

public class Copy_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data limit = ");
        int a = sc.nextInt();
        int [] b = new int[a];
        int [] c = new int[a];
        System.out.print("Enter data of b[] = ");
        for (int i = 0; i < a; i++){
            b[i] = sc.nextInt();
            c[i] = b[i];
        }
        System.out.print("Array of b[] = ");
        for (int i = 0; i < a; i++){
            System.out.print(b[i]+" ");
        }System.out.println();
        System.out.print("Array of C[] = ");
        for (int i = 0; i < a; i++){
            System.out.print(+c[i]+" ");
        }
    }
}
