package OOP.Inheritance;

public class Toyota extends Car{
    public static String country;
    public static String engineType;

    public static void main(String[] args) {
        make = "Toyota";
        model = "Prius";
        year = 2023;
        color = "Silver";
        tireSize = 16;
        engineSize = 1.7;
        country = "Japan";
        engineType = "Hybrid";
        displayInfo();
    }
    public static String getCountry(){
        return country;
    }

    public static String getEngineType(){
        return engineType;
    }

    public static void displayInfo(){
        System.out.println(getColor());
        System.out.println(getMake());
        System.out.println(getEngineSize());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getTireSize());
        System.out.println(country);
        System.out.println(getEngineType());
    }
}
