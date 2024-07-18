import java.util.Scanner;

public class Ascend_by_bubble_sort {
    //Ascending the nth number value by Bubble Sorting
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n'th = ");
        int n = sc.nextInt();
        System.out.print("Enter up to n'th numbers value = ");
        int [] nthNumber = new int[n];
        for (int i = 0; i <= nthNumber.length-1; i++){
            nthNumber[i] = sc.nextInt();
        }
        ascendingTheNthNumberByBubbleSort(nthNumber);
    }
    public static void ascendingTheNthNumberByBubbleSort(int nthNumber[]){
        for(int i = 0; i <= nthNumber.length-1; i++){
            for(int j = 0; j < nthNumber.length-i-1; j++){
                if(nthNumber[j] > nthNumber[j + 1]){
                    int temp = nthNumber[j + 1];
                    nthNumber[j + 1] = nthNumber[j];
                    nthNumber[j] = temp;
                }
            }
        }
        printArray(nthNumber);
    }
    public static void printArray(int [] numbers) {
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] +" ");
        }
    }
}
