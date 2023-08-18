package OOP.Inheritance;

public class Cat extends Animal{
    public static void main(String[] args) {
        makeSound();
        run();
    }

    public static void makeSound(){
        System.out.println("Cat making Sound");

    }
    public static void run(){
        System.out.println("Car Running");
    }

    public static void jumpHigher(){
        System.out.println("Cat jumping");
    }

}
