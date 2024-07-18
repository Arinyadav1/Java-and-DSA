public class Quick_sort {
    public static void main(String[] args) {
        int [] arr = {4, 2, 9, 6, 7, 6, 4, 9,10, 63, 13, 83, 19, 11, 35, 32, 24, 24,87, 58, 78, 34, 35, 89, 57, 56, 78, 98, 77, 54, 22, 11, 5, 2, 66};
        sort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
    public static void sort(int [] arr, int low, int high) {
        if(low < high){
            int pidx = partition(arr, low, high);
            sort(arr, low, pidx-1);
            sort(arr, pidx+1, high);
        }
    }
    public static int partition(int [] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;

    }
}
