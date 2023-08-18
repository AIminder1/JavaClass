package ClassesAndObjectsPartOne;

public class University {
    public long studentCount;
    public int courseCount;
    public String address;
    public int buildingCount;
    public int age;
    public  String type;

    public University(long studentCount,int courseCount){
        this.studentCount = studentCount;
        this.courseCount = courseCount;

    }
    public University(String address, int buildingCount, int age){
        this.address = address;
        this.buildingCount =buildingCount;
        this.age = age;

    }

    public University(String type){
        this.type = type;
    }


    public void displayInfo(){
        System.out.println(studentCount);
        System.out.println(courseCount);
    }
}
