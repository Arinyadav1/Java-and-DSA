import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(solveNQueen(n));
        System.out.println(solveNQueen(n).size() +" Soulution for place the " +n +" Queen in safe place in " +n +"x" +n +" order board");
    }
    public static List<List<String>> solveNQueen(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoard, 0);
        return allBoard;
    }
    public static void helper(char[][] board, List<List<String>> allBoard, int col){
        if (col == board.length){
            saveBoard(board, allBoard);
            return;

        }
        for(int row = 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoard, col + 1);
                board[row][col] = ' ';
            }
        }
    }
    public static boolean isSafe(int row, int col, char[][] board){
        //horzontal
        for(int i = 0; i < board.length; i++){ 
            if(board[row][i] == 'Q'){
                return false;
            }
        }
        //verticle
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //left upper
        int r = row;
        for(int i = col; 0 <= i && 0 <= r; i--, r--){
            if(board[r][i] == 'Q'){
                return false;
            }
        }
        //right upper
        r = row;
        for(int i = col; i < board.length && 0 <= r; i++, r--){
            if(board[r][i] == 'Q'){
                return false;
            }
        }
        //right down
        int c = col;
        for(int i = row; i < board.length && c < board.length; i++, r++){
            if(board[i][c] == 'Q'){
                return false;
            }
        }
        //left down
        c = col;
        for(int i = row; i < board.length && 0 <= c; i++, c--){
            if(board[i][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void saveBoard(char[][] board, List<List<String>> allBoard){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++){
            row = "";
             for (int j = 0; j < board.length; j++){
                 if(board[i][j] == 'Q'){
                     row += 'Q';
                 } else {
                     row += '.';
                 }
             }
             newBoard.add(row);
        }
        allBoard.add(newBoard);
    }
}
