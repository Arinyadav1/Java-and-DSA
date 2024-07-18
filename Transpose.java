import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Numbers of Rows = ");
        int r = sc.nextInt();
        System.out.print("Enter Numbers of Column = ");
        int c = sc.nextInt();
        int [] [] transpose = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                transpose[i][j] = sc.nextInt();
            }
        }
         for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(transpose[j][i] +" ");
            } System.out.println();
        }
        
    }
}
