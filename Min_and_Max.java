import java.util.Scanner;

public class Min_and_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int [] mima = new int[value];
        for (int i = 0; i < value; i++){
            mima[i] = sc.nextInt();
        } 
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < value; i++){
            if (mima[i] < max){
                 max = mima[i];
            }
            if (mima[i] > min){
                 min = mima[i];
            }
        } System.out.println("Min " +max);
        System.out.println("Max " +min);
    }
}
