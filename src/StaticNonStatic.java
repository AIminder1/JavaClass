public class StaticNonStatic {
    public static void main(String[] args) {
        donutsDunkin();
        StaticNonStatic m = new StaticNonStatic();
        m.helloSomthing();
    }
    static void donutsDunkin(){
        System.out.println("Hi");
    }
    void helloSomthing(){
        System.out.println("Good afternoon");

    }
}
