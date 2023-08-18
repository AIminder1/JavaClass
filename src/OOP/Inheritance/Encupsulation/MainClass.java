package OOP.Inheritance.Encupsulation;

import OOP.Inheritance.Encupsulation.BankAccount;

public class MainClass {
    public static void main(String[] args) {

        BankAccount johnAccount = new BankAccount();

        johnAccount.setAccountNumber("12313123134");
        johnAccount.setAccountBalance(100);
        johnAccount.setCustomerName("John W");
        johnAccount.setCustomerEmailAddress("John@gmail.com");
        johnAccount.setCustomerPhoneNumber("1234131421");


        System.out.println("Account #" + johnAccount.getAccountNumber());
        System.out.println("Account Balance #" + johnAccount.getAccountBalance());
        System.out.println("Customer Name #" + johnAccount.getCustomerName());
        System.out.println("Customer Email Address #" + johnAccount.getCustomerEmailAddress());
        System.out.println("Customer Phone Number#" + johnAccount.getCustomerPhoneNumber());

        johnAccount.deposit(850);
        System.out.println("Account Balance #" + johnAccount.getAccountBalance());

        johnAccount.withdraw(150);
        johnAccount.withdraw(50);
        johnAccount.withdraw(120);
        johnAccount.withdraw(23.99);

        System.out.println("Account Balance #" + johnAccount.getAccountBalance());

        johnAccount.withdraw(600);
        System.out.println("Account Balance #" + johnAccount.getAccountBalance());

    }
}
