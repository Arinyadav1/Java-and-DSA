import java.util.Scanner;
public class Replace_strings {
    public static void main(String[] args) {
        //Convert Alphabetical Characters Name in Mathamatical Digits
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Namer = ");
        String name = sc.nextLine();
        System.out.print("Alphabatical Name = ");
        for(int i = 0; i < name.length(); i++){
            switch (name.charAt(i)){
                case 'A' :
                case 'a' : System.out.print("1 ");
                break;
                case 'B' :
                case 'b' : System.out.print("2 ");
                break;
                case 'C' :
                case 'c' : System.out.print("3 ");
                break;
                case 'D' :
                case 'd' : System.out.print("4 ");
                break;
                case 'E' :
                case 'e' : System.out.print("5 ");
                break;
                case 'F' :
                case 'f' : System.out.print("6 ");
                break;
                case 'G' :
                case 'g' : System.out.print("7 ");
                break;
                case 'H' :
                case 'h' : System.out.print("8 ");
                break;
                case 'I' :
                case 'i' : System.out.print("9 ");
                break;
                case 'J' :
                case 'j' : System.out.print("10 ");
                break;
                case 'K' :
                case 'k' : System.out.print("11 ");
                break;
                case 'L' :
                case 'l' : System.out.print("12 ");
                break;
                case 'M' :
                case 'm' : System.out.print("13 ");
                break;
                case 'N' :
                case 'n' : System.out.print("14 ");
                break;
                case 'O' :
                case 'o' : System.out.print("15 ");
                break;
                case 'P' :
                case 'p' : System.out.print("16 ");
                break;
                case 'Q' :
                case 'q' : System.out.print("17 ");
                break;
                case 'R' :
                case 'r' : System.out.print("18 ");
                break;
                case 'S' :
                case 's' : System.out.print("19 ");
                break;
                case 'T' :
                case 't' : System.out.print("20 ");
                break;
                case 'U' :
                case 'u' : System.out.print("21 ");
                break;
                case 'V' :
                case 'v' : System.out.print("22 ");
                break;
                case 'W' :
                case 'w' : System.out.print("23 ");
                break;
                case 'X' :
                case 'x' : System.out.print("24 ");
                break;
                case 'Y' :
                case 'y' : System.out.print("25 ");
                break;
                case 'Z' :
                case 'z' : System.out.print("26 ");
                break;
            }
        }
    }
}
