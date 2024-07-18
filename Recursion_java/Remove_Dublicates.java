public class Remove_Dublicates {
    public static void main(String[] args) {
        String str = "aabbddcceeffaabc";
        removeDublicatesOfString(str, "", 0);

    }
    public static boolean[] map = new boolean[26];
    public static void removeDublicatesOfString(String str, String removeDubStr, int inx) {
        if(inx == str.length()){
            System.out.println(removeDubStr);
            return;
        }
        if(map[str.charAt(inx) - 'a'] == true){
            removeDublicatesOfString(str, removeDubStr, inx+1);
        } else {
            removeDubStr += str.charAt(inx);
            map[str.charAt(inx) - 'a'] = true;
            removeDublicatesOfString(str, removeDubStr, inx+1);
        }
    }
}
