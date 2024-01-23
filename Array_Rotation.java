import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {
        //Program For Array Rotation
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data Size = ");
        int size = sc.nextInt();
        System.out.print("Enter Data Value = ");
        int [] data = new int[size];
        for (int i = 0; i < size; i++){
            data[i] = sc.nextInt();
        }
        System.out.print("Enter Value after rotata Data = ");
        int r = sc.nextInt();
        arrayRotation(data, size, r);
    }
    public static void arrayRotation(int data[], int size, int r) {
        System.out.print("Rotating Value Of Data = ");
        for (int i = r; i < size; i++){
            System.out.print(data[i] +" ");
        }
        for (int i = 0; i < r; i++){
            System.out.print(data[i] +" ");
        }
    }
}
