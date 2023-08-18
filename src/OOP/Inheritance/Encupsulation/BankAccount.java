package OOP.Inheritance.Encupsulation;

public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void deposit(double amount){
        this.accountBalance += amount;
    }

    public void withdraw (double withdrawAmount){
        if(this.accountBalance - withdrawAmount < 0){
            System.out.println("Only " + this.accountBalance + " available. Withdraw not precessed");

        }else{
            this.accountBalance-=withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " processed Remaining Balance = " + this.accountBalance);
        }
    }




    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
