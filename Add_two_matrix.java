import java.util.*;
public class Add_two_matrix {
    public static void main(String[] args) {
        //Program to Add two Matrices
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter First Matrix Data Row length = ");
        int m1r = sc.nextInt();
        System.out.print("Enter First Matrix Data Column length = ");
        int m1c = sc.nextInt();
        int [][] matrix1 = new int[m1r][m1c];
        System.out.println("Enter 1 matrix Data");
        for (int i = 0; i < m1r; i++){
            for (int j = 0; j < m1c; j++){
                matrix1 [i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Second Matrix Data Row length = ");
        int m2r = sc.nextInt();
        System.out.print("Enter Second Matrix Data Column length = ");
        int m2c = sc.nextInt();
        int [][] matrix2 = new int[m2r][m2c];
        System.out.println("Enter 1 matrix Data");
        for (int i = 0; i < m2r; i++){
            for (int j = 0; j < m2c; j++){
                matrix2 [i][j] = sc.nextInt();
            }
        }
        System.out.println("Print Add Two 1 and 2 Matrix");
        int [][] matrix3 = new int[m2r][m2c];
        for (int i = 0; i < m2r; i++){
            for (int j = 0; j < m2c; j++){
                matrix3 [i][j] = matrix1 [i][j] + matrix2 [i][j];
                System.out.print(matrix3[i][j]+" ");
            }System.out.println();
        }
    }
}
