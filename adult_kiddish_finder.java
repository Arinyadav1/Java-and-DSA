import java.util.*;
public class adult_kiddish_finder{
    public static void main(String [] args){
        Scanner arin = new Scanner (System.in);
        System.out.print("Enter You Age = ");
        int Age = arin.nextInt();
        if (Age > 150){
            System.out.println("Please do'nt comedy with me because no one live to much Years");
        } else if (Age >= 71 ){
                 System.out.println("You are Adult and You are at the end of your Life that's why behave good charcter and happinesh with Everbody ");
        } else if (Age >= 18){
                 System.out.println("You are Adult So take responsibilty of your family");  
        } else if (Age < 18) {
                 System.out.println(" You are Kiddish so enjoy your childness witn fun and entertainment");
        }
    }
}