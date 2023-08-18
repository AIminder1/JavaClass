package OOP.Inheritance;

public class Ford extends Car {

    public static String country;
    public static void main(String[] args) {
        make = "Ford";
        model = "F150";
        year = 2023;
        color = "White";
        tireSize = 25;
        engineSize = 5.7;
        country = "United States";
        displayInfo();
    }

    public static void displayInfo(){
        System.out.println(getColor());
        System.out.println(getMake());
        System.out.println(getEngineSize());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getTireSize());
        System.out.println(country);
    }

    public static String getCountry(){
        return country;
    }

}
