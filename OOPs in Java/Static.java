class Student{
    String name;
    static String school;
}
public class Static {
    public static void main(String[] args) {
        Student.school = "DPS";
        Student s1 = new Student();
        s1.name = "Rohan";
        System.out.println(Student.school);
        System.out.println(s1.name);
    }
}
