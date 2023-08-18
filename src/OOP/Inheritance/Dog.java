package OOP.Inheritance;

public class Dog extends Animal{
    public static void main(String[] args) {
        makeSound();
        run();

        Animal.makeSound();
        Animal.run();

        Dog.makeSound();
        Dog.run();
    }

    public static void makeSound(){
        System.out.println("Dog making sound");
    }

    public static void run(){
        System.out.println("Dog Running");
    }
}
