import java.util.*;
public class find_days_by_day_number {
    public static void main(String [] args0){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The Day Number which you want to know the day name = ");
        int DayNumber = sc.nextInt();
        switch (DayNumber){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break; 
            case 7 : System.out.println("sunday");
            break;
            default : System.out.println("Please enter correct value the week days only seven"); 
            
        }

    }
}
