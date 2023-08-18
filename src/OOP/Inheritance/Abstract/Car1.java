package OOP.Inheritance.Abstract;

public abstract class Car1 {

    public String make(String str){
        return str;
    }
    void model(){

        System.out.println("VN");
    }
    void year(){
        System.out.println("2023");
    }
    void VIN(){
        System.out.println("VIN");
    }

    abstract void starting();
    abstract void driving();
    abstract void stopping();
    abstract void parking();
}
