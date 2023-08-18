public class Constructor {
    /*Task: Create a Class for Students
    Create a Java class called Student that represents a
    student's information. The class should have the following
    attributes: name, age, and grade. Implement a constructor
    that takes values for these attributes as parameters and initializes the object's state*/

    public String studentName;
    public int studentAge;
    public char studentGrade;


    public Constructor(String name, int age, char grade){
        this.studentName = name;
        this.studentAge = age;
        this.studentGrade = grade;


    }


    public static void main(String[] args) {
        Constructor student = new Constructor("Alex", 22, 'A');
        System.out.println(student.studentName);
        System.out.println(student.studentAge);
        System.out.println(student.studentGrade);


    }
}
