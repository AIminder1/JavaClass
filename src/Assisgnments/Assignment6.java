package Assisgnments;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        //1. Write a program to check if a given number is positive or negative using if-else statements.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num: ");
        int pos = sc.nextInt();
        if(pos > 0 ){
            System.out.println("Positive!");
        }else if (pos == 0 ){
            System.out.println("Your num zero");
        }else System.out.println("Negative!");

        //2. Write a program to find the maximum of three numbers using if-else statements.
        System.out.print("First num: ");
        int f = sc.nextInt();
        System.out.print("Second num: ");
        int s = sc.nextInt();
        System.out.print("Third num: ");
        int t = sc.nextInt();
        if( f > s && f > t){
            System.out.println(f + " " + " This max ");
        }else if (s > f && s > t){
            System.out.println(s + " " +" This max ");
        }else {
            System.out.println(t + " " + "This max");
        }

        //3. Write a program to check if a given year is a leap year using if-else statements.

        System.out.print("Enter check is year is a leap year or not: ");
        int year = sc.nextInt();
        if ((year % 4 == 0)&&(year % 100 !=0) || (year % 400 == 0)) {
            System.out.println("Year is a leap"+ " " + year);
        }else {
            System.out.println("Not a leap year");
        }

        //4. Write a program to check if a given character is a vowel or consonant using if-else statements.

        System.out.print("Enter character: ");
        char ar = sc.next().charAt(0);

        if(ar == 'a' || ar == 'e' || ar == 'i' || ar == 'o' || ar == 'u'
                || ar == 'A' || ar == 'E' || ar == 'I' || ar == 'O' || ar == 'U'){
            System.out.println(ar+ " " + "a Vowel");
        }else {
            System.out.println("Consonant");
        }

        //5. Write a program to check if a given number is even or odd using if-else statements.
        System.out.print("Enter num : ");
        int even = sc.nextInt();
        if (even % 2 == 0){
            System.out.println(even + " " + " is even num");
        }else {
            System.out.println("Odd num");
        }

        //6. Write a program to determine the grade of a student based on their score using if-else statements
        System.out.print("Enter student score: ");
        int score = sc.nextInt();
        if (score <= 60){
            System.out.println("Your score is F" + " " + score);
        } else if (score <= 70) {
            System.out.println("Your score is D" + " " + score);
        }  else if (score <= 80) {
            System.out.println("Your score is C" + " " + score);
        } else if (score <= 90) {
            System.out.println("Your score is B" + " " + score);
        }else System.out.println("Your score is A");

        // 7. Write a program to calculate the area of different shapes (circle, rectangle, triangle) using switch statements.

        System.out.println("1. Circle\n2. Rectangle \n3.Triangle ");
        System.out.println("Enter num: ");
        int shapes = sc.nextInt();
        double area = 0;

        switch (shapes) {
            case 1:
                System.out.print("Enter Radius: ");
                double radius = sc.nextDouble();
                area = 3.14159 * radius * radius;
                break;

            case 2:
                System.out.print("Enter Width: ");
                double width = sc.nextDouble();
                System.out.print("Enter Length: ");
                double length = sc.nextDouble();
                area = length * width;
                break;
            case 3:
                System.out.print("Enter BASE: ");
                double base = sc.nextDouble();
                System.out.print("Enter HEIGHT: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;


            default:
                System.out.println("Choice 1 or 2 or 3");
        }
        System.out.println(area);


        //8. Write a program to check if a given number is a prime number using if-else statements.

        System.out.print("Enter num: ");
        int num = sc.nextInt();
        boolean prime = false;
        for (int i = 2; i<=num/2; ++i){
            if (num % i == 0){
                prime = true;
                break;
            }
        }

        if(!prime) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number ");
        }

        //9. Write a program to check if a given string is a palindrome using if-else statements.

        System.out.print("Enter String to check palindrome: ");
        String pal = sc.next();
        String reverse = new StringBuilder(pal).reverse().toString();
        if(pal.equals(reverse)){
            System.out.println("It is a palindrome");
        }else System.out.println("It is not a palindrome");

        //10. Write a program to convert a given month number
        //into its corresponding month name using switch statements.
        System.out.println("Enter month num: ");
        int month = sc.nextInt(); // Input month number here

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Try again");
                break;
        }
    }
}
