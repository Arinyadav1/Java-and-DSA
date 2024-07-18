import java.util.Scanner;

public class Normal_and_trace {
    public static void main(String[] args) {
        // Program to Find the Normal and Trace of a Matrix
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column length = ");
        int rc = sc.nextInt();
        int [][] Nor_tra = new int[rc][rc];
        System.out.println("Enter the data");
        for(int i = 0; i < rc; i++){
            for(int j = 0; j < rc; j++){
                Nor_tra[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Normal Of Matrix = " +findNormalOfMatrix(Nor_tra, rc));
        System.out.println("Trace Of Matrix = " +findTraceOfMatrix(Nor_tra, rc));
    }
    public static int findNormalOfMatrix (int Nor_tra[][], int rc){
        int s = 0;
        for(int i = 0; i < rc; i++){
            for(int j = 0; j < rc; j++){
               s += (Nor_tra[i][j]) * (Nor_tra[i][j]);
            } 
        } return (int)Math.sqrt(s);
    }
    public static int findTraceOfMatrix (int Nor_tra[][], int rc){
        int s = 0;
        for(int i = 0; i < rc; i++){
               s += Nor_tra[i][i];
        } return s;
    }
}