package OOP.Inheritance.Abstract;

public class Dog implements AnimalInterface, LocationInterface {
    @Override
    public void makeSound() {
        System.out.println("Dog makes sound");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats mean");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void addressLocation() {
        System.out.println("Address: 123 Main ave");
    }

    @Override
    public void zip() {
        System.out.println("12345");

    }
}
