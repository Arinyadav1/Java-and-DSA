import java.util.*;
public class Solve { 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
         * 
         */
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int N = 2;
        for(int i = 1; i <= 10; i++){
            System.out.println(N +" x " +i +" = " +(N*i));
        }
        
    }
}