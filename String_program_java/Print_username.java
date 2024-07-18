import java.util.Scanner;

public class Print_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("E-mail = ");
        String email = sc.next();
        String userName = "";
        for (int i = 0; i < email.length(); i++){
            if(email.charAt(i) != '@'){
                userName += email.charAt(i);
            } else {
                break;
            }
        } System.out.println("usernama = "+userName);
    }
    
}
