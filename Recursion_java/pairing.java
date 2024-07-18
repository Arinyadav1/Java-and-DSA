public class pairing {
    public static void main(String[] args) {
        int numberOfGuest = 4;
        System.out.println(pairingTheNumberOfGuest(numberOfGuest));
    }
    public static int pairingTheNumberOfGuest(int n) {
        if(n<=1){
            return 1;
        }
        int method1 = pairingTheNumberOfGuest(n-1);
        int method2 = (n-1) * pairingTheNumberOfGuest(n-2);
        return method1 + method2;
    }
}
