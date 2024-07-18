public class Subsequence {
    public static void main(String[] args) {
        String str = "ABC";
        allSubsequenceOfString(str, 0, "");
       }
    public static void allSubsequenceOfString(String str, int inx, String newString){
        if(inx == str.length()){
            System.out.println(newString);
            return;
        }
        allSubsequenceOfString(str, inx + 1, newString+str.charAt(inx)); // include Call
        allSubsequenceOfString(str, inx + 1, newString); // excledue Call
    }
}
