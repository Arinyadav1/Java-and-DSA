public class problem {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 7};
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}
