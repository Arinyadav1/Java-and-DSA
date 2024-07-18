public class Check_Array_Sorted {
    public static void main(String[] args) {
        int array []= {2, 3, 6, 5, 6};
        // checkArraySorted(array, 0);
        System.out.println(checkArraySorted(array, array.length-1));
    }
    public static boolean checkArraySorted(int array[], int inx) {
        if(inx == 0){
            return true;
        }
        if(array[inx - 1] > array[inx]){
          return false;  
        }          
        return checkArraySorted(array, inx - 1);
    }
}
