package ClassesAndObjectsPartOne;

public class Husky {
    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.name = " Tarzan";
        husky.breed = "Husky";
        husky.age = 3;
        husky.color = "Grey";
        husky.size = "Medium";

        husky.bark();
        husky.eat();
        husky.run();
        husky.play();
    }
}
