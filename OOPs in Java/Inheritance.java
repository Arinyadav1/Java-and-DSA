class Smartphone{
    String modalName;
    int price;
}
class Vivo extends Smartphone{
    public static void printVivo(String modalName, int price){
        System.out.print(modalName);
        System.out.println("  " +price);
    }
}
class Realme extends Smartphone{
    public static void printRealme(String modalName, int price){
        System.out.print(modalName);
        System.out.println("  " +price);    }
}
class Oppo extends Smartphone{
    public static void printOppo(String modalName, int price){
        System.out.print(modalName);
        System.out.println("  " +price);    }
}


public class Inheritance {
    // Inheritance 
    // Many types of inheretance -> Single, Multi, Hirarchy, and Hybrid
    public static void main(String[] args) {
        Vivo v1 = new Vivo();
        Realme r1  = new Realme();
        Oppo o1 = new Oppo(); 
        v1.modalName = "Vivo V30e";
        v1.price = 27999;
        r1.modalName = "Realme 11 Pro Plus";
        r1.price = 29999;
        o1.modalName = "OPPO Reno 10 Pro";
        o1.price = 34999;
        Vivo.printVivo(v1.modalName, v1.price);
        Realme.printRealme(r1.modalName, r1.price);
        Oppo.printOppo(o1.modalName, o1.price);
        
    }
}
