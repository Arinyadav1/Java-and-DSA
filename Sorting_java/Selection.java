public class Selection {
    public static void main (String arg []){
        //Bubble sorting technic
        int ap [] = {3, 8, 6, 2, 7}; 
        selectionSorting(ap);
        }
        public static void selectionSorting(int ap[]){
            
            for(int i = 0; i < ap.length-1; i++){
                int s = i;
                for(int j = i + 1; j < ap.length; j++ ){
                    if (ap[s] > ap[j]){
                        s = j;
                    }
                }
                //swap
                int temp = ap[s];
                ap[s] = ap[i];
                ap[i] = temp;

            }
            for (int i = 0; i <= ap.length-1; i++ ){
                System.out.print(ap[i] +" ");
            }
            
        }
}
