package Assisgnments;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Write a program to concatenate two strings without using the concat() method.

        String str = "Java is ";
        String str1 = "fun";

        String addString = str + str1;

        System.out.println(addString);
        //2. Write a program to extract the middle character(s) from a given string.

        System.out.println(" Your text: ");

        String string1 = sc.next();  // Change this to any string you'd like to test

        int length = string1.length();
        String result;

        if (length % 2 == 0) {
            // If string length is even, remove the middle two characters
            result = string1.substring(0, length / 2 - 1) + string1.substring(length / 2 + 1);
        } else {
            // If string length is odd, remove the middle character
            result = string1.substring(0, length / 2) + string1.substring(length / 2 + 1);
        }

        System.out.println("Middle removing: " + result);

        //3. Write a program to remove all the vowels from a given string.
        System.out.println("Enter to remove vowels: ");

        String text = sc.next();
        String result2 = text.replaceAll("[AEUOIaiuoe]", "");

        System.out.println(result2);

                /*
4. Write a program to capitalize the first letter of each word in a sentence.
5. Write a program to count the number of words in a sentence.
6. Write a program to check if a string contains only numeric characters.
7. Write a program to check if a string starts with a specific prefix.
8. Write a program to check if a string ends with a specific suffix.
9. Write a program to convert a string to camel case.
10. Write a program to check if a string is a valid email address.

*/







    }




}


