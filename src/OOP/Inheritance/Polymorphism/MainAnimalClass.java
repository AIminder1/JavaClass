package OOP.Inheritance.Polymorphism;

public class MainAnimalClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Tiger();
        animal.makeSound();



    }
}
