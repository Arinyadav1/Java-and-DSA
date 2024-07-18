public class Reverse_String {
    public static void main(String[] args) {
        String str = "Arin Yadav";
        reverseString(str, str.length()-1);
    }
    public static void reverseString(String str, int inx) {
        if(inx == -1){
            return;
        }
        System.out.print(str.charAt(inx));
        reverseString(str, inx-1);
    }
}
