class Sizeguide{
    String size;
    String chest;
    String shoulder;
    String sleeve;
    String neck;
    String length;

    public void printSize(String size, String chest,  String neck) {
        System.out.println(size);
        System.out.println(chest);
        System.out.println(neck);
    }
    public void printSize(String shoulder, String sleeve) {
        System.out.println(shoulder);
        System.out.println(sleeve);
    }
    public void printSize(String length) {
        System.out.println(length);
    }

}
public class Polymorphism{
    // Two or more same Method name with different parameters is call polymorphism
    public static void main(String[] args) {
        Sizeguide sizechart = new Sizeguide();
        sizechart.size = "Medium";
        sizechart.shoulder = "18 inch Shoulder";
        sizechart.chest = "43.7 inch Chest";
        sizechart.neck = "16.1 inch Neck";
        sizechart.length = "29.1 inch Length";
        sizechart.sleeve = "25.6 inch Sleeve";

        sizechart.printSize(sizechart.size, sizechart.chest, sizechart.neck);
        sizechart.printSize(sizechart.shoulder, sizechart.sleeve);
        sizechart.printSize(sizechart.length);
    }
}