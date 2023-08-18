package AnimalTask;

public class Dog extends Mammal{
    public static String playGame;

    public static void main(String[] args) {
        name = "Dog";
        type = "Home";
        size = "Medium";
        age = 10;
        color = "White";
        eat = "Meat";
        land = "Everywhere";
        hunt = "Sometime";
        playGame = "Yeess";

        displayInfo();
        System.out.println(getPlayGame());
    }
    public static String getPlayGame(){
        return playGame;
    }
}
