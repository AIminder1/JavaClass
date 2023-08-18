package OOP.Inheritance.Abstract;

public class iPhone implements Phone{
    public static void main(String[] args) {
        iPhone phone  =new iPhone();
        phone.text();
        phone.call();
        phone.ring();
    }
    @Override
    public void text() {
        System.out.println("You can text to someone");
    }

    @Override
    public void call() {
        System.out.println("You can call someone");
    }

    @Override
    public void ring() {
        System.out.println("Someone can call you");

    }
}
