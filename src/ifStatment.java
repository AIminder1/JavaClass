import java.util.Scanner;

public class ifStatment {
    public static void main(String[] args) {
        if (5 < 6){
            System.out.println("5 is less then 6");
        }

        if ( 10 == 10){
            System.out.println("Number are equal");
        }

        if (true) {
            System.out.println("This is true if");

        }

        if (false) {
            System.out.println("This is false if");

        }

        // > 0 is positive
        // < 0 negative
        //write a java code to find out if
        // the number from user is + or -

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number ");

        int input = userInput.nextInt();

        if (input > 0){
            System.out.println("Positive Number");


        }

        if (input < 0 ){
            System.out.println("Negative Number");
        }

        System.out.println("Enter a number:");
        input = userInput.nextInt();

        if (input % 2 == 0 ){
            System.out.println("Even Number: ");

        }

        if ( input % 2 != 0){
            System.out.println("Odd Number: ");
        }

        System.out.println("Enter Your age: ");
        input = userInput.nextInt();

        if(input >= 21){
            System.out.println("You are  eligible vote");

        }

        if (input < 21 ){
            System.out.println("You are too young to vote");
        }




    }
}
