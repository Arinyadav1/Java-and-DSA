public class Tower_of_Hanoi{
    public static void main(String ars []){
        int n = 3;
        towerOfHanoi(n, "Source", "Helper", "Destination");
    }
    public static void towerOfHanoi(int n, String S, String H, String D) {
        if(n == 1){
            System.out.println("The Disk trasfer "+n +" from " +S +" to " +D);
            return;
        };
        towerOfHanoi(n - 1, S, D, H);
        System.out.println("The Disk trasfer "+n +" from " +S +" to " +D);
        towerOfHanoi(n - 1, H, S, D);
        
    }
}