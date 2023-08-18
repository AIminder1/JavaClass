package OOP.Inheritance.Abstract;

public class Paint extends Drawing{
    @Override
    void drawing() {
        System.out.println("Painting a picture");
    }

    @Override
    int numberOfPaintings() {
        return 5;
    }

    @Override
    void nameOfPainter(String name) {
        System.out.println("Name is: " + name);
    }
}
