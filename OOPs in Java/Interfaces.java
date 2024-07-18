interface Animal{
    int EYE = 2;
    void eat();
}
interface Carnivorous{
    void carnivorous();
}
class Lion implements Animal, Carnivorous{
    @Override
    public void eat(){
        System.out.println("Lion eat meat");
    }
    public void carnivorous(){
        System.out.println("Yes' Lion is Carnivorous");
    }
}
class Cow implements Animal, Carnivorous{
    @Override
    public void eat(){
        System.out.println("Cow eat Grass");
    }
    public void carnivorous(){
        System.out.println("No' Cow is not Carnivorous");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        Cow c1 = new Cow();
        l1.eat();
        l1.carnivorous();
        c1.eat();
        c1.carnivorous();
        
    }
}
