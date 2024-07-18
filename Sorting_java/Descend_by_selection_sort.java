import java.util.Scanner;

public class Descend_by_selection_sort {
    //Descending the nth number value by Selection Sorting

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth number = ");
        int n = sc.nextInt();
        System.out.print("Enter up to nth Number Value = ");
        int [] descend = new int [n];
        for(int i = 0; i < descend.length; i++){
            descend[i] = sc.nextInt();
        }
        descendNthNumberBySelectionSort(descend);
    }
    public static void descendNthNumberBySelectionSort(int [] numbers){
        for(int i = 0; i < numbers.length; i++){
            int s = i;
            for(int j = i + 1; j < numbers.length; j++){
                if (numbers[s] <  numbers[j]){
                    s = j;
                }
            }
            int temp = numbers[s];
            numbers[s] = numbers[i];
            numbers[i] = temp;
        }
        printArray(numbers);
    }
    public static void printArray(int [] numbers) {
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] +" ");
        }
    }
}
