package OOP.Inheritance;

public class BMW extends Car {

    public static String country;
    public static String packageType;

    public static void main(String[] args) {
        make = "BMW";
        model = "F150";
        year = 2024;
        color = "Gray";
        tireSize = 45;
        engineSize = 3.7;
        country = "Germany";
        packageType = "M";

        displayInfo();
    }
    public static String getCountry(){
        return country;
    }
    public static String getPackageType(){
        return packageType;
    }
    public static void displayInfo(){

        System.out.println(getColor());
        System.out.println(getMake());
        System.out.println(getEngineSize());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getTireSize());
        System.out.println(country);
        System.out.println(getPackageType());
    }
}
