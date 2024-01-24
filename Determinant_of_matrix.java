import java.util.Scanner;

public class Determinant_of_matrix {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3x3 matrix Data");
    int a = 3;
    int [][] matrix = new int[a][a];
    for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                matrix[i][j] = sc.nextInt();
            }
        }   
         
        System.out.println("Determinant of givent 3x3 Matrix = " +determinantOfMatrix(matrix));
    }
    public static int determinantOfMatrix(int m[][]) {
        int j = (m[0][0] * ((m[1][1]*m[2][2]) - (m[2][1]*m[1][2]))) -
                (m[0][1] * ((m[1][0]*m[2][2]) - (m[2][0]*m[1][2]))) + 
                (m[0][2] * ((m[2][1]*m[1][0]) - (m[1][1]*m[2][0])));
        return j;
    } 
}

