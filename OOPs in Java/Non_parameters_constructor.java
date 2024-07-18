class Student{
    String name;
    String rollNumber;
    String semester;
    String branch;
    char section;
    public void printData(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
        System.out.println(this.semester);
        System.out.println(this.branch);
        System.out.println(this.section);
    }
    Student(){
        
        System.out.println("Data of first Student ");
    }
}

public class Non_parameters_constructor {
    public static void main(String[] args) {
        Student stdData = new Student();
        stdData.name = "Arin Yadav";
        stdData.rollNumber = "230111009052";
        stdData.semester = "2nd";
        stdData.branch = "Computer Science";
        stdData.section = 'D';
        stdData.printData();


    }
}