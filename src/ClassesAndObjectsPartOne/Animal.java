package ClassesAndObjectsPartOne;

public class Animal {
    public String name;
    public String color;
    public String type;
    int age;
    double weight;

    public Animal(String name,String color,String type,int age,double weight){
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
        this.weight = weight;

    }

    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

}
