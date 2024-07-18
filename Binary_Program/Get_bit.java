public class Get_bit{
    public static void main(String[] args) {
        // get value from binarry number 
        // Get Bit Operator
        int number = 7;
        int position = 3;
        int Bitmask = 1 << position;
        if ((number & Bitmask) == 0){
            System.out.println("At position " +position +" is 0");
        } else{
            System.out.println("At position " +position +" is 1");
        }

    }
}