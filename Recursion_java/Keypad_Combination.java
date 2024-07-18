public class Keypad_Combination {
    public static void main(String[] args) {
        String str = "23";
        keypadCombination(str, 0, "");
    }
    
    public static String [] keypad = {" ", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void keypadCombination(String str, int inx, String comString) {
        if(inx == str.length()){
            System.out.println(comString);
            return;
        }
        // char presentChar = str.charAt(inx);
        String mapString = keypad[str.charAt(inx) - '0'];
        for(int i = 0; i < mapString.length(); i++){
            keypadCombination(str, inx+1, comString+mapString.charAt(i));
        }
    }
}
