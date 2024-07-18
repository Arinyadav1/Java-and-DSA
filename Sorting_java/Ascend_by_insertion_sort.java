import java.util.*;
public class Ascend_by_insertion_sort {
    // Ascending the nth numbers by the Insertion sorting
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter nth number = ");
        int n = sc.nextInt();
        System.out.print("Enter up to nth number values = ");
        int [] ascendData = new int[n];
        for(int i = 0; i < ascendData.length; i++){
            ascendData[i] = sc.nextInt();
        }
        ascendingTheNthNumberByInsertionSort(ascendData);
    }
    public static void ascendingTheNthNumberByInsertionSort(int[] ascendData){
        for(int i = 1; i < ascendData.length; i++){
            int present = ascendData[i];
            int j = i - 1;
            while(j >= 0 && ascendData[j] < present){
                ascendData[j + 1] = ascendData[j];
                j--;
            }
            ascendData[j + 1] = present;
        }
        printArray(ascendData);
    }
    public static void printArray(int [] ascendData){
        for(int i = 0; i < ascendData.length; i++){
            System.out.print(ascendData[i] +" ");
        }
    }
}
