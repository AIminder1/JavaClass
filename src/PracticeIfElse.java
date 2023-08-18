import java.util.Scanner;

public class PracticeIfElse {
    public static void main(String[] args) {

        /*Task : Ticket Price Calculator
        Write a program that calculates the ticket price for a movie based on the following conditions:
        Age 0-5: Free
        Age 6-12: $5
        Age 13-59: $10
        Age 60 and above: $7*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        double ticket;
        if (age >= 0 && age <= 5 ){
            ticket = 0;
        }else if(age >= 6 && age <= 12 ){
            ticket = 5;
        }else if (age >= 13 && age <= 59){
            ticket = 10;
        }else if (age >= 60 && age<= 99){
            ticket = 7;
        }else{
            System.out.println("Invalid age");
            return;
        }

        System.out.println("The ticket price is:" + ticket);













    }
}
