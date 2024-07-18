public class Bubble{
    public static void main (String arg []){
    //Bubble sorting technic
    int ap [] = {3, 8, 6, 2, 7}; 
    bubbleSorting(ap);
    }
    public static void bubbleSorting(int ap[]){
        for(int i = 0; i <= ap.length-1; i++){
            for(int j = 0; j < ap.length-i-1; j++ ){
                if (ap[j] > ap[j + 1]){
                    //swap
                    int temp = ap[j + 1];
                    ap[j + 1] = ap[j];
                    ap[j] = temp;
                }
            }
        }
        for (int i = 0; i <= ap.length-1; i++ ){
            System.out.print(ap[i] +" ");
        }
    }
}