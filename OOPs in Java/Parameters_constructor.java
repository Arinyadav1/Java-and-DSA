class Student{
    String name;
    String rollNumber;
    String semester;
    String branch;
    char section;
    public void printData(){
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(semester);
        System.out.println(branch);
        System.out.println(section);
    }
    Student(String name, String rollNum, String sem, String branch, char sec){
        System.out.println("Info of Student");
        this.name = name;
        this.rollNumber = rollNum;
        this.semester = sem;
        this.branch = branch;
        this.section = sec;
       
       
    }
}

public class Parameters_constructor {
    public static void main(String[] args) {
        String name = "Arin Yadav";
        String rollNumber = "230111009052";
        String semester = "2nd";
        String branch = "Computer Science";
        char section = 'D';
        Student stdData = new Student(name, rollNumber, semester, branch, section);
        stdData.printData();
       


    }
}