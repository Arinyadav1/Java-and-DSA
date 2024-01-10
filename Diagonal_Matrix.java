import java.util.Scanner;

public class Diagonal_Matrix {
    public static void main(String[] args) {
        //Program to Compute the Sum of Diagonals of a Matrix
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Row and Column Size = ");
        int rcS = sc.nextInt();
        int [][] matrix = new int [rcS][rcS];
        System.out.println("Enter the Data of Matrix");
        for (int i = 0; i < rcS; i++){
            for (int j = 0; j < rcS; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of Principle Diagonal = " +sumOfPrincipleDiagonalsMatrix(matrix, rcS));
        System.out.println("Sum of Secondry Diagonal = " +sumOfSecondryDiagonalsMatrix(matrix, rcS));
        
    }
    public static int sumOfPrincipleDiagonalsMatrix(int matrix[][], int r){
        int pD = 0;
        for (int j = 0; j < r; j++){
            pD += matrix[j][j];
        }
        return pD;
    }
    public static int sumOfSecondryDiagonalsMatrix(int matrix[][], int r){
        int sD = 0;
        for (int i = 0; i < r; i++){
             sD += matrix[i][(r-1)-i];
        }
        return sD;
    }
}
