
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
        System.out.println();
    }
}

public class Oops_concept {
    public static void main(String[] args) {
        Student stdData = new Student();
        stdData.name = "Arin Yadav";
        stdData.rollNumber = "230111009052";
        stdData.semester = "2nd";
        stdData.branch = "Computer Science";
        stdData.section = 'D';
        

        Student stdData1 = new Student();
        stdData1.name = "Kaif";
        stdData1.rollNumber = "230111009068";
        stdData1.semester = "2nd";
        stdData1.branch = "Computer Science";
        stdData1.section = 'D';

        Student stdData2 = new Student();
        stdData2.name = "Sammer";
        stdData2.rollNumber = "230111009067";
        stdData2.semester = "2nd";
        stdData2.branch = "Computer Science";
        stdData2.section = 'D';
        stdData.printData();
        stdData1.printData();
        stdData2.printData();



    }
}