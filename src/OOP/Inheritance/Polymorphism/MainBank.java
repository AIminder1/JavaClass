package OOP.Inheritance.Polymorphism;

public class MainBank {
    public static void main(String[] args) {
        FederalReserveBank federal = new FederalReserveBank();
        int rate = federal.interestRate();
        System.out.println("FederalReserveBank's Rate is: " + rate);


        federal = new Chase();
        rate = federal.interestRate();
        System.out.println("Chase Rate is: " + rate);

        federal = new BankOfAmerica();
        rate = federal.interestRate();
        System.out.println("Bank of American's Rate is: " + rate);

        federal = new WellsFargo();
        rate = federal.interestRate();
        System.out.println("WellsFargo's Rate is: " + rate);

        federal = new CapitalOne();
        rate = federal.interestRate();
        System.out.println("CapitalOne's Rate is: " + rate);
    }
}
