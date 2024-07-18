import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers of Row = ");
        int r = sc.nextInt();
        System.out.print("Enter Numbers of Column = ");
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        System.out.println("Enter Matrix Data respectable rows and columns");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
            int rS = 0;
            int rE = r -1;
            int cS = 0;
            int cE = c -1;
            while(rS <= rE && cS <= cE){
                for (int col = cS; col <= cE; col++){
                    System.out.print(matrix[rS][col] +" ");
                }
                rS++;
                for (int row = rS; row <= rE; row++){
                    System.out.print(matrix[row][cE] +" ");
                }
                cE--;
                for (int col2 = cE; cE <= col2; col2--){
                    System.out.print(matrix[rE][col2] +" ");
                }
                rE--;
                for (int row2 = rE; rE <= row2; row2--){
                    System.out.print(matrix[row2][cS] +" ");
                }
                cS++;
            }
        }
    }
    
