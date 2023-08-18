package OOP.Inheritance;

public class ParentClass {
    public static void printName(){
        System.out.println("This is Parent Class");

    }
    public int addTwoNumbers(){
        System.out.println("This is addTwoNumbers method from Parent Class" + (50 + 50));
        return addTwoNumbers();
    }

    public void drawingShape(){
        System.out.println("This is parent Class: Drawing Circle Shape");
    }

}
