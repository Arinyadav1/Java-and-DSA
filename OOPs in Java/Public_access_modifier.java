

class Smartphone{
    /*
    this is Public Access Modifier use
     <--within in class-->
     <--with in package-->
     <--outside package by subclass-->
     <--outside package--> 
     */
    public String modal;
    public int price;
    void printData(){
        System.out.println(modal);
        System.out.println(price);
    }
}


public class Public_access_modifier {
    public static void main(String[] args) {
        Smartphone obj = new Smartphone();
        obj.modal = "Samsung Galaxy S24 Ultra";
        obj.price = 150000;
        obj.printData();
    }
}
