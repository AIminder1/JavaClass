package OOP.Inheritance.Abstract;

public class Bike extends Vehicle{

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.moveForward();
        bike.moveBackward();
        bike.turnLeft();
        bike.turnRight();
        bike.drive();
    }

    @Override
    void moveForward() {
        System.out.println(" Bike is Moving forward");
    }

    @Override
    void moveBackward() {
        System.out.println(" Bike is Moving backward");
    }

    @Override
    void turnLeft() {
        System.out.println(" Bike is Turning Left");
    }

    @Override
    void turnRight() {
        System.out.println(" Bike is Turning Right");
    }


}
