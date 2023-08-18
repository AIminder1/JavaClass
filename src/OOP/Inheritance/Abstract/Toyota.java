package OOP.Inheritance.Abstract;

public class Toyota extends Car1{

    @Override
    void starting() {
        System.out.println("Press to Start");
    }

    @Override
    void driving() {

        System.out.println("Toyota is driving");
    }

    @Override
    void stopping() {

        System.out.println("Toyota going to stop");
    }

    @Override
    void parking() {

        System.out.println("Parking Mode");
    }

    public static void main(String[] args) {
        Toyota t = new Toyota();
        t.starting();
        t.driving();
        t.stopping();
        t.parking();
        t.model();
        t.year();
        t.make("re");
        System.out.println(t.make("Str"));
        t.VIN();
    }
}
