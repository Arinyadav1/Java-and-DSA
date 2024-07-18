public class Clean_bit {
    public static void main (String [] args){
        // Clean value place 1 to 0 and 0 to 0 in binary number
        // Clean Bit Operator 
        int number = 13; // 1101
        int position = 0;
        // clean value 1 at position 2
        int Bitmask = 1 << position;
        int changeValue = ~Bitmask;
        int finalValue = changeValue & number;
        System.out.println(finalValue);
    }
}
