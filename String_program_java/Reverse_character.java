import java.util.Scanner;

public class Reverse_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text = ");
        String text = sc.nextLine();
        String reverse = "";
        for(int i = text.length() - 1; i >= 0; i--){
            reverse += text.charAt(i);
        } System.out.println("Recerse text = " +reverse);
    }
}
