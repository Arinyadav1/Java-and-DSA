import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class problems {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveBoard(n));
    }
    public static List<List<String>> solveBoard(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        putQueenInBoard(allBoard, board, 0);
        return allBoard;
    }
    public static void putQueenInBoard(List<List<String>> allBoard, char[][] board, int col){
        if(col == board.length){
            saveBoard(allBoard, board);
            return;
        }
        for(int row = 0; row < board.length; row++){
            if(isPlaceSafe(board, col, row)){
                 board[row][col] = 'Q';
                 putQueenInBoard(allBoard, board, col+1);
                 board[row][col] = ' ';
            }
        }
    }
    public static boolean isPlaceSafe(char[][] board, int col, int row){
        //vertical
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //horizontal 
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == 'Q'){
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
    public static void saveBoard(List<List<String>> allBoard, char[][] board){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i = 0; i <board.length; i++){
            row = "";
            for (int j = 0; j < board.length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);

    }
}