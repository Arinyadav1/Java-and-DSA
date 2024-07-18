import java.util.Scanner;

public class Check_two_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Compare 2 Array if same print Yes
        System.out.print("Enter Ist Array Data size = ");
        int a1 = sc.nextInt();
        System.out.print("Enter IInd Array Data size = ");
        int a2 = sc.nextInt();
        int array1 [] = new int[a1];
        int array2 [] = new int[a2];
        System.out.println("Enter Ist Array Data value");
        for (int i = 0; i < a1; i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter Ist Array Data value");
        for (int i = 0; i < a1; i++){
            array2[i] = sc.nextInt();
        }

    
        boolean r = true;
        if (a1 == a2){
            for (int i = 0; i < a1; i = i + 1){
                if (array1[i] != array2[i]){
                    r = false;
                }
            }
        } else {
            r = false;
        }

        if(r == true){
            System.out.println("Arrays are Equals");
        } else {
            System.out.println("Arrays are not Equals");
        }

    }
}
