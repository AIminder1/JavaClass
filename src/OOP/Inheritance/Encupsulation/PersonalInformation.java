package OOP.Inheritance.Encupsulation;

public class PersonalInformation {

    public String BOD;
    public int zipCode;

    private String name;
    private String emailAddress;
    private int age;
    private long cellNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=65){

        }
        this.age = age;
    }

    public long getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(long cellNumber) {
        this.cellNumber = cellNumber;
    }



}
