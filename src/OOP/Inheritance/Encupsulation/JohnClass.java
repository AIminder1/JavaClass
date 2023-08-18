package OOP.Inheritance.Encupsulation;

public class JohnClass {
    public static void main(String[] args) {
        PersonalInformation person = new PersonalInformation();

        person.setName("John");
        System.out.println(person.getName());

        person.setCellNumber(24342342);
        System.out.println(person.getCellNumber());

        person.setAge(22);
        System.out.println(person.getAge());

        person.setEmailAddress("John@gmail.com");
        System.out.println(person.getEmailAddress());

        person.BOD = "1/23/1977";
        person.zipCode = 1233;

        System.out.println(person.BOD);
        System.out.println(person.zipCode);







    }
}
