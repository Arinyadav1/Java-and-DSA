public class Move_maze {
    public static void main (String args []){
        int a = 3, b = 3;
        int total = countPathInMaze(a, b, 1, 1);
        System.out.println(total);

    }
    public static int countPathInMaze(int a, int b, int i, int j) {
        if(i == a+1 || j == b+1){
            return 0;
        }
        if(i == a && j == b){
            return 1;
        }
        int downpath = countPathInMaze(a, b, i+1, j);
        int rightpath = countPathInMaze(a, b, i, j+1);
        return downpath + rightpath;
    }
}
