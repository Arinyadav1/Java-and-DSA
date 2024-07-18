//Abstraction is hiding the implementation details and showing only important/useful parts of the user
abstract class Animal{
    abstract void eat();
    public void walk(){
        System.out.println("Majority Animals walk on 4 legs");
    }
}
class Cow extends Animal{
    @Override
    public void eat(){
        System.out.println("Cow eat Glass");
    }
}
class Lion extends Animal{
    @Override
    public void eat(){
        System.out.println("Lion eat Meat");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Lion lion = new Lion();
        cow.eat();
        cow.walk();
        lion.eat();
        lion.walk();
    }
}
