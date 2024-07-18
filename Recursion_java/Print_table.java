import java.util.Scanner;

public class Print_table {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the nth Number = ");
        int num = sc.nextInt();
        printTable(num, 1, 0);
    }

    public static void printTable(int num, int i, int table){
        if(i == 11){
            return;
        }
        table = num * i;
        
        printTable(num, i + 1, table);
        System.out.println(table);
    }
}

