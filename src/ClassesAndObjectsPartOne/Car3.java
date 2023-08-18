package ClassesAndObjectsPartOne;

public class Car3 {

    public String make;
    public String model;
    public int age;

    public Car3(String make, String model, int age){
        //this
        this.make = make;
        this.model = model;
        this.age = age;
    }

    public  void displayINfo(){
        System.out.println(make);
    }
    public static void main(String[] args) {
        Car3 car = new Car3("Ford", "F150",1);
        car.displayINfo();
    }
}
