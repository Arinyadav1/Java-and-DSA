public class Set_bit {
    public static void main(String [] arg){
        // Set value place 0 to 1 and 1 to 1 in binary number
        // Set Bit Operator 
        // int number = 5; // 00101
        // int position = 4;
        // // set value 1 at position 3
        // int Bitmask = 1 << position;
        // int finalValue = Bitmask | number;
        // System.out.println(finalValue);
        String number = "101";
        for(int i = 0; i < number.length() ; i++){
            char ch = number.charAt(i);
            System.out.println(ch);
        }
    }
}
