package ClassesAndObjectsPartOne;

public class ClassContain {
    //Instance Variables
    int y = 20;
    int z = 40;

    //Let's access directly Class variables
    static  int a = 60;
    static boolean b = true;
    static
    String text = "Java";
    //local Variables
    public static void main(String[] args) {

        Car car = new Car();

        car.make = "BMW";
        car.model = "i8";
        car.color = "Blue";
        car.door = 2;
        car.tire = 4;
        car.engineSize = 6.0;

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.door);
        System.out.println(car.tire);
        System.out.println(car.engineSize);

    }

    public static void printName(String name){
        String name2 = "John";

    }





}
