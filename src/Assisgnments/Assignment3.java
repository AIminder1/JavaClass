package Assisgnments;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        //*Task 1. Write a program that prompts the user to enter their name and then prints out a greeting message with their name.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name;
        name = sc.next();

        System.out.println("Hello " + name);


        //Task 2. Create a program that asks the user for two numbers and calculates their sum.

        System.out.print("Write your First number: ");
        int num1 = sc.nextInt();

        System.out.print("Write your Second number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum: " + (num1 + num2));


        //Task 3. Write a program that prompts the user to enter their age and then prints
        // out a message stating whether they are a minor or an adult.
        System.out.println("Enter you age to watch film: ");
        int minor = sc.nextInt();

        if(minor < 18){
            System.out.println(" You too young ");
        }else{
            System.out.println("You are adult");
        }

        //Task 4. Create a program that asks the user for their weight in pounds and converts it to kilograms.
        System.out.print("Enter your weight to converts to kilograms: ");
        int pounds = sc.nextInt();

        double kilo = pounds * 0.45359237;
        System.out.println("Your weight to kg:" + kilo);

        //Task 5. Write a program that prompts the user to enter a radius and calculates the area of a circle with that radius.

        System.out.print("Enter the radius to calculate: ");
        double radius = sc.nextDouble();

        double p = 3.14159;


        double area = p * radius * radius;
        System.out.println(" Area of circle: " + area);

        //Task 6. Create a program that asks the user for their favorite color and then prints out a message saying "Your favorite color is [color]."

        System.out.print("What's your favorite color? ");
        String color;
        color = sc.next();

        System.out.println("Your favorite color is: " + color);

        //Task 7. Write a program that prompts the user to enter a temperature in Fahrenheit and converts it to Celsius.

        System.out.println("Enter temperature to convert it to Celsius: ");
        double temp = sc.nextDouble();

        double celsius = (temp - 32) * 5 / 9;
        System.out.println("Enter: " + celsius);

        //Task 8. Create a program that asks the user for their birth year and then calculates their age.

        System.out.println("Enter your birth year: ");
        int year = sc.nextInt();

        int age = 2023 - year;
        System.out.println("Your age is : " + age);


        //Task 9. Write a program that prompts the user to enter a number and checks if it is positive or negative.

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if(num > 0 ){
            System.out.println("Your number is positive:");
        }else if(num < 0 ){
            System.out.println("Your number is negative");

        }else{
            System.out.println("Please enter more than zero number");
        }

        //Task 10. Create a program that asks the user for a string and then prints out the length of the string.*/

        System.out.print("Enter a string: ");
        String str = sc.next();

        int length = str.length();

        System.out.println("The length of the string is: " + length);
    }
}
