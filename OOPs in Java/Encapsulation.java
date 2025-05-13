import bank.*;

public class Encapsulation {

 class Student {
     private String name; // data hidden
     public void setName(String n) { // setter
     name = n;}
     public String getName() { // getter
     return name;
     }
}
    
    public static void main(String[] args) {
       Student s = new Student();
       s.setName("John");
       System.out.println(s.getName()); // Output: John
    }
}
