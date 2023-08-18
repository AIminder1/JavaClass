package OOP.Inheritance.Encupsulation;

public class BMW {
    public static void main(String[] args) {
        Car bmw = new Car();

        bmw.setMake("BMW");
        bmw.setModel("X7");
        System.out.println(bmw.getMake() + " " + bmw.getModel());
    }

}
