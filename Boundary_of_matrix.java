import java.util.Scanner;

public class Boundary_of_matrix {
    public static void main(String[] args) {
        // Program to Print Boundary Elements of the Matrix
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Row Size = ");
        int rS = sc.nextInt();
        System.out.print("Enter Column Size = ");
        int cS = sc.nextInt();
        int [][] matrix = new int[rS][cS];
        System.out.println("Enter Matrix Data = ");
        for(int i = 0; i < rS; i++){
            for(int j = 0; j < cS; j++){
                matrix[i][j] = sc.nextInt();
            }
        } printBoundaryElementsOfMatrix(matrix, rS, cS);
    }
    public static void printBoundaryElementsOfMatrix(int matrix[][], int r, int c) {
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if (i == 0 || j == 0 || i == (r-1) || j == (c-1)){
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(" ");
                }
            }System.out.println();
        } 
    }
}
