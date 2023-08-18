package OOP.Inheritance;

public class Test {
    public static void main(String[] args) {
        One one = new Two();
        one.print();
    }
}

class One1{
    int x;
    public One1(int x){
        this.x = x;
    }
}
