package OOP.Inheritance.Encupsulation;

public class UserOne {
    public static void main(String[] args) {
        LoginPage login = new LoginPage();


        login.setUserName("UserOn");
        login.setPassword("Password1");
        System.out.println(login.getUserName());
        System.out.println(login.getPassword());
        int a = 0, b = 5;
        while( b-- > a++)
            System.out.println(a);

    }

}
