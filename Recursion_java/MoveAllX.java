public class MoveAllX {
    public static void main (String args []){
        String str = "Arxixn Yaxdaxv";
        moveTheXInEndOfTheString(str, "", 0, 0);
    }
    public static void moveTheXInEndOfTheString(String str, String movedStr, int inx, int Xcount) {
        if(inx == str.length()){
            for(int i = 1; 1 <= Xcount; i++){
                movedStr += 'x';
            }
            
            System.out.println(movedStr);
            return;
        }
        if(str.charAt(inx) == 'x' || str.charAt(inx) == 'X'){
            Xcount++;
            moveTheXInEndOfTheString(str, movedStr, inx+1, Xcount);
        }else{
            movedStr = movedStr + str.charAt(inx);
            moveTheXInEndOfTheString(str, movedStr, inx+1, Xcount);
        }
    }
}
