import java.util.Scanner;

public class Sphere {
    public static void main(String [] args){
    Scanner arin = new Scanner(System.in);
        System.out.println("Find The Total Surface Area Of the Sphere");
    System.out.print("Enter the radius in Cm = ");
    int r = arin.nextInt();
    float p = 3.1428571428571431f, area;
     area = (r * r * 4 * p);
        System.out.print("Total Area = " +area );



    }
}