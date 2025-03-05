
public class Java_Array {
    public static void main(String[] args) {
        // Array
        System.out.println("1D Array");
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        System.out.println("2D Array");

        // 2D Array Matrix
        int[][] arr2 = new int[3][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;
        arr2[2][0] = 7;
        arr2[2][1] = 8;
        arr2[2][2] = 9;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
            System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        

        
    }
}
