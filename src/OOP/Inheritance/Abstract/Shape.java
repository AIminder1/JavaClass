package OOP.Inheritance.Abstract;

public class Shape extends Drawing{
    @Override
    void drawing() {
        System.out.println("Drawing Circle");
    }

    @Override
    int numberOfPaintings() {
        return 50;
    }

    @Override
    void nameOfPainter(String name) {
        System.out.println("Name is " + name);
    }

    public static void main(String[] args) {
        Shape sh = new Shape();
    }
}
