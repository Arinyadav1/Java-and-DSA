public class Insertion {
    public static void main (String arg []){
        //Insertion sorting technic
        int ap [] = {3, 8, 6, 2, 7, 5, 4, 2, 9, 5, 1, 0, 3, 1, 5, 3, 9, 4, 6, 5, 3, 2, 7, 8, 3, 6, 8, 5, 2,}; 
        insertionSorting(ap);
        }
        public static void insertionSorting(int ap[]){
            
            for(int i = 1; i < ap.length; i++){
                int j = i - 1;
                int present = ap[i];
                while(j >= 0 && present > ap[j]){
                    ap[j + 1] = ap[j];
                    j--;
                }
                //placement
                ap[j + 1] = present;

            }
            for (int i = 0; i <= ap.length-1; i++ ){
                System.out.print(ap[i] +" ");
            }
            
        }
}
