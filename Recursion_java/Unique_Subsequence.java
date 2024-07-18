import java.util.HashSet;
public class Unique_Subsequence {
    public static void main(String[] args) {
        String str = "AAAA";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequenceOfString(str, 0, "", set);
    }
    public static void uniqueSubsequenceOfString(String str, int inx, String newString, HashSet<String> set){
        if(inx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }
        uniqueSubsequenceOfString(str, inx + 1, newString+str.charAt(inx), set); // include Call
        uniqueSubsequenceOfString(str, inx + 1, newString, set); // excledue Call
    }
}
