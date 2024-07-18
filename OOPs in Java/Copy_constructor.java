class Student{
    String name;
    String rollNumber;
    String semester;
    String branch;
    char section;
    public void printData(){
        System.out.println("Info of Student");
        System.out.println(this.name);
        System.out.println(this.rollNumber);
        System.out.println(this.semester);
        System.out.println(this.branch);
        System.out.println(this.section);
    }
    Student(Student stdData1 ){
        
        this.name = stdData1.name;
        this.rollNumber = stdData1.rollNumber;
        this.semester = stdData1.semester;
        this.branch = stdData1.branch;
        this.section = stdData1.section;
       
    }
    Student(){}
}

public class Copy_constructor {
    public static void main(String[] args) {
        Student stdData = new Student();
        stdData.name = "Arin Yadav";
        stdData.rollNumber = "230111009052";
        stdData.semester = "2nd";
        stdData.branch = "Computer Science";
        stdData.section = 'D';
        Student stdData1 = new Student(stdData);
        stdData1.printData();


    }
}