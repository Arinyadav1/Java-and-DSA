class Grocery{
    /*
    this is Default Access Modifier use
     <--within in class-->
     <--with in package-->
     */
    String flour;
    String oil;
    String rice;
    void printData(){
        System.out.println(flour);
        System.out.println(oil);
        System.out.println(rice);
    }
}
public class Default_access_modifier {
    public static void main(String[] args) {
        Grocery g1 = new Grocery();
        g1.flour = "Wheat flour";
        g1.oil = "Coconut Oil";
        g1.rice = "Basmati Rice";
        g1.printData();
    }
}
