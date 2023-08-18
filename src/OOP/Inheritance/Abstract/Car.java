package OOP.Inheritance.Abstract;

public class Car extends Vehicle{


    @Override
    void moveForward() {
        System.out.println("Car is Moving forward");
    }

    @Override
    void moveBackward() {

        System.out.println("Car is Moving backward");
    }

    @Override
    void turnLeft() {

        System.out.println("Car is Turning Left");
    }

    @Override
    void turnRight() {

        System.out.println("Car is Turning Right");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.moveForward();
        car.moveBackward();
        car.turnLeft();
        car.turnRight();
        car.drive();
    }
}
