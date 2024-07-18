public class Permutations {

 public static void main(String[] args) {
    String str = "abc";
    permutationsOfSttring(str, "");

 }
 public static void permutationsOfSttring(String str, String newString) { // abc, ""
    if(str.length() == 0) {
        System.out.println(newString);
        return;
    }
    for(int i = 0; i < str.length(); i++){ 
    char cuString = str.charAt(i); // c
    String newStr = str.substring(0, i) + str.substring(i + 1); // b
    permutationsOfSttring(newStr, newString+cuString); // b, ac
    }
 }
}