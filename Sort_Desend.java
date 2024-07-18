import java.util.Scanner;

public class Sort_Desend {
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data Limit = ");
        int v = sc.nextInt();
        int [] desending = new int[v];
        for (int i = 0; i < v; i++){
            desending[i] = sc.nextInt();
        }
        for (int i = 0; i < v; i++){
            for (int j = i+1; j < v; j++){
                if (desending[i] < desending[j]){
                    int a = desending[i];
                    desending[i] = desending[j];
                    desending[j] = a;
                }
            }
        }
         for (int i = 0; i < v; i++){
            System.out.print(desending[i] +" ");
        }
    }
}
