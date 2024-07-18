class Student{
    /*
    this is Protected Access Modifier use
     <--within in class-->
     <--with in package-->
     <--outside package by subclass-->
     */
    protected String name;
    protected int rollNo;
    protected String studentClass;
    void printStudentData(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(this.studentClass);
    }
    void printStudentData1(){
        name = "Rohan";
        rollNo = 24;
        studentClass = "IV";
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(studentClass);
    }
}
public class Protected_access_modifier {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jivika";
        s1.rollNo = 17;
        s1.studentClass = "VII";
        s1.printStudentData();
        s1.printStudentData1();
    }

}
