public class PlaceTiles {
    public static void main(String[] args) {
        int n = 4, m = 2; 
        int totalPlace = placedTiles(n, m);
        System.out.println(totalPlace);
    }

    public static int placedTiles(int n, int m) {
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        int vericalPlace = placedTiles(n-m, m);
        int horizontalPlace = placedTiles(n-1, m); 
        return vericalPlace + horizontalPlace;
    }
}
