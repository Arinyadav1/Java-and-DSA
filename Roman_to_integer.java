import java.util.Scanner;

public class Roman_to_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Number = ");
        String str = sc.next();
        System.out.println("Value = "+romanToInteger(str));

    } public static int getValue(char r) {
        switch (r){ 
            case 'I' :return 1;
            case 'V' :return 5;
            case 'X' :return 10;
            case 'L' :return 50;
            case 'C' :return 100;
            case 'D' :return 500;
            case 'M' :return 1000;
            default : return 0;
        }
    } public static int romanToInteger(String str) {
        int total = 0;
        for(int i = 0; i < str.length(); i++){
            int v1 = getValue(str.charAt(i));
            if(i + 1 < str.length()){
                int v2 = getValue(str.charAt(i + 1));
                if(v1 >= v2){
                    total = total + v1;
                } else {
                    total = total - v1;
                }
            } else {
                total = total + v1;
            }
        } return total;
    }

}
