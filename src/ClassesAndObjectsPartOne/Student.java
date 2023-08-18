package ClassesAndObjectsPartOne;

public class Student {
    String name;
    int age;
    String gender;
    int year;
    int course;
     public Student(String name, int age, String gender){
         this.name = name;
         this.age = age;
         this.gender = gender;
     }

     public void displayInfoId(){
         System.out.println(name);
         System.out.println(age);
         System.out.println(gender);
     }
     public Student(int year, int course){
         this.year = year;
         this.course = course;
     }

     public void displayInfo(){
         System.out.println(year);
         System.out.println(course);
     }


     public static void main(String[] args) {
        Student id = new Student("Peter", 21,"Male" );
        id.displayInfoId();
        Student year = new Student(2002,2);
        year.displayInfo();
     }





}
