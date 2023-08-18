package OOP.Inheritance.Polymorphism;

public class MainClassEarth {
    public static void main(String[] args) {
        Earth earth = new Earth();
        earth.people();
        earth.weather();
        int o = earth.ocean();
        System.out.println(o);

        earth = new Africa();
        earth.people();
        earth.weather();
        earth.ocean();

        earth = new America();
        earth.ocean();
        earth.people();
        earth.weather();
    }
}
