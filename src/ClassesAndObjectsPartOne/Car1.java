package ClassesAndObjectsPartOne;

public class Car1 {

    public String color;
    public String make;
    public String model;


    public Car1(){
        color = "Red";
        make = "Benz";
        model = "S63";

    }
    public void display(){
        System.out.println("Make");
    }

    public static void main(String[] args) {
        Car1 car  = new Car1();
        System.out.println(car.make);
        System.out.println(car.color);

    }
}
