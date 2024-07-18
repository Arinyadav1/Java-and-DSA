import java.util.*;
public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text = ");
        String s = sc.nextLine();
        System.out.println(reverseString(s));
    }
    public static String reverseString(String str){
        String strReverse = "";
        for (int i = 0; i < str.length() ; i++){
            StringBuilder rev = new StringBuilder();
            while(i < str.length() && str.charAt(i) != ' ' ){
                rev.append(str.charAt(i));
                i++;
            } 
            // if (rev.length() != 0){
                strReverse = " " +rev +strReverse;
            // }
        }
        return strReverse.substring(1);
    } 
}
