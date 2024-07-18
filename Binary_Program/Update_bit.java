public class Update_bit {
    public static void main (String [] ars){
        // update value from O to 1 and 1 to 0 in binary number.
        int number = 12; // 1100
        int position = 0;
        int value = 1;
        int Bitmask = 1 << position;
        if (value == 0){
            int changeValue = ~Bitmask;
            int Update0 = changeValue & number;
            System.out.println("Update 0 Value = " +Update0);
        } else {
            int Update1 = Bitmask | number;
            System.out.println("Update 1s Value = " +Update1);
        }
    }
}
