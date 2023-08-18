package OOP.Inheritance;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        printName();

    }
    public static void printName(){
        System.out.println("This is a Child Class");
    }

    @Override
    public int addTwoNumbers() {
        System.out.println("This is a child class" + (100+ 100));

        return 100+100;
    }

    @Override
    public void drawingShape(){
        addTwoNumbers();
        printName();
    }
}
