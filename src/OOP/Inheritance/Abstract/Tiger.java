package OOP.Inheritance.Abstract;

public class Tiger extends Animal{


    public static void main(String[] args) {
        displayInfo();
    }
    static void displayInfo(){
        Tiger tiger = new Tiger();
        tiger.setName("Sherkhan");
        tiger.setAge(4);
        tiger.setWeight(180.88);
        tiger.eat();
        tiger.breath();
        tiger.makeSound();
        tiger.run();
    }



    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    void eat() {
        System.out.println(getName()+"Tiger eat the meat");
    }

    @Override
    void makeSound() {
        System.out.println(getName()+"Tiger make sound: HIYAAAA");
    }

    @Override
    void breath() {

        System.out.println(getName()+"Breath");
    }

    @Override
    void run() {

        System.out.println("Running");
    }
}
