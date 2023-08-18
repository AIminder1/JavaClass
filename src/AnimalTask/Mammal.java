package AnimalTask;

public class Mammal extends Animal {

    public  static String hunt;

    public static void main(String[] args) {
        name = "Monkey";
        type = "Wild";
        size = "small";
        age = 4;
        color = "Brown";
        eat = "Fruit";
        land = "Mumbai";
        hunt = "Yes";
        displayInfo();
    }
    public static String getHunt(){
        return hunt;
    }
    public static void displayInfo(){
        System.out.println(getName());
        System.out.println(getType());
        System.out.println(getColor());
        System.out.println(getAge());
        System.out.println(getSize());
        System.out.println(getEat());
        System.out.println(getLand());
        System.out.println(getHunt());
    }
}
