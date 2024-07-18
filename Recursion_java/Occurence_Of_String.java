public class Occurence_Of_String {
    public static void main(String[] args) {
        String str = "i Love Programming because it is my passion"; 
        stringOccurence(str, 0, str.charAt(0));
    }
    public static int first = -1;
    public static int last = 0;
    public static void stringOccurence(String str, int inx, char element){
        if(inx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(inx);
        if (currentChar == element){
           if(first == -1){
            first = inx + 1;
           } else {
            last = inx + 1;
           }
        }
        stringOccurence(str, inx + 1, element);
    }
}
