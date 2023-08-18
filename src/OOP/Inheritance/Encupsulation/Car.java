package OOP.Inheritance.Encupsulation;

public class Car {
    private String model;
    private String make;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.equals("BMW")){
            this.model = model;

        }else {
            this.model = "Invalid Model";
        }

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make.equals("BMW")){
            this.make = make;

        }else {
            this.make = "Invalid Make";
        }
    }



}
