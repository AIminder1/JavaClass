package OOP.Inheritance.Abstract;

public abstract class Vehicle {

    abstract void moveForward();
    abstract void moveBackward();
    abstract void turnLeft();
    abstract void turnRight();

    public void drive(){
        System.out.println("Driving");
    }


}
