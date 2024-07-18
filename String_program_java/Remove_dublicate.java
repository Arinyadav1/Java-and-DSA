public class Remove_dublicate{
    public static void main(String[] args) {
        String str = "Java and JavaScript";
        removeDulicateCharacterInString(str);
    }
    public static void removeDulicateCharacterInString(String str){
        char ch = 'a';
        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    switch (str.charAt(i)){
                        case 'a':
                        case 'A': 
                    }
                }
            }
            System.out.print(ch +" ");
        }
    }
}