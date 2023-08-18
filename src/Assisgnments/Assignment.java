package Assisgnments;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        //Task 1: Write a program to check if a number is positive or negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number to check negative or positive");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Your number is " + num + " positive");
        } else if (num < 0) {
            System.out.println("Your number is " + num + " negative");
        } else {
            System.out.println("Your number is zero! Try again");
        }


        //Task 2: Write a program to check if a number is divisible by 5.
        System.out.println("Enter number to check divisible ny 5: ");
        int num2 = sc.nextInt();
        if (num2 % 5 == 0) {
            System.out.println("The number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }


        //Task 3: Write a program to check if a year is a leap year or not.
        System.out.println("Enter check is year is a leap year or not:");
        int year = sc.nextInt();
        if ((year % 4 == 0)&&(year % 100 !=0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }


        //Task 4: Write a program to check if a character is an alphabet or not.
        System.out.println("Enter to check is character is an alphabet or not: ");
        char ch = sc.next().charAt(0);
        if ((ch >='a' && ch <= 'z') || (ch >= 'A' && ch <='Z')){
            System.out.println("Ir is an alphabet");
        }else {
            System.out.println("It is not an alphabet");
        }


        //Task 5: Write a program to check if a number is even or odd.
        System.out.println("Enter number to check is it even or odd");
        int even = sc.nextInt();
        if (even % 2 == 0) {
            System.out.println("Even num");
        } else {
            System.out.println("Odd num");
        }


        // Task 6: Write a program to check if a given string is empty or not.
        System.out.println("Enter a string ");
        String str1 = sc.nextLine();

        if (str1.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String not empty");
        }


        //Task 7: Write a program to check if a number is a prime number or not.
        System.out.println("Enter the number to check prime number: ");
        int num1 = sc.nextInt();
        boolean prime = false;
        for (int i = 2; i<=num1/2; ++i){
            if (num1 % i == 0){
                prime = true;
                break;
            }
        }

        if(!prime) {
            System.out.println(num1 + " is a prime number");
        }
        else {
            System.out.println(num1 + " is not a prime number ");
        }


        //Task 8: Write a program to check if a given string is a palindrome or not.
        System.out.println("Enter String to check palindrome: ");
        String pal = sc.next();
        String reverse = new StringBuilder(pal).reverse().toString();
        if(pal.equals(reverse)){
            System.out.println("It is a palindrome");
        }else System.out.println("In is not a palindrome");


        //Task 9: Write a program to calculate the sum of digits of a given number.
        System.out.println("Enter your number to digits:  ");
        int digits = sc.nextInt();
        int sum = 0;
        while (digits != 0){
            sum+= digits % 10;
            digits/= 10;
        }
        System.out.println("The sum of the digits is: " + sum);


        //Task 10: Write a program to find the largest among three numbers.
        System.out.println("Enter your first num: ");
        double one = sc.nextInt();
        System.out.println("Enter your second num: ");
        double two= sc.nextInt();
        System.out.println("Enter your third num: ");
        double three = sc.nextInt();
        if (one >= two && one >= three ){
            System.out.println("Largest number is " + one);
        }else if(two >=one && two >= three) {
            System.out.println("Largest number is " + two);
        }else System.out.println("Largest number is " + three);
    }

}