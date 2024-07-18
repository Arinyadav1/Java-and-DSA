import java.util.Scanner;

public class Replace_string {
    public static void main(String[] args) {
        //replace the letter ‘e’ in the original string with letter ‘i’. 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String text = sc.next();
        String replaceText = "";
        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) != 'e'){
                replaceText += text.charAt(i);
            } else {
                replaceText += 'i';
            }
        } System.out.println("Replace String = "+replaceText);
    }
}
