package Assisgnments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Write a program to count the number of characters in a given string.
        System.out.print("Enter sting: ");
        String str = sc.nextLine();
        int count = str.length();
        System.out.println(count);


        //2. Write a program to reverse a given string.

        System.out.print("Enter String to reverse: ");
        String reverse = sc.nextLine();
        StringBuilder str1 = new StringBuilder(reverse);

        str1.reverse().toString();
        System.out.println(str1);


        //3. Write a program to check if two strings are anagrams of each other.
        System.out.print("Enter your first anagram: ");
        String anagram1 = sc.nextLine();
        System.out.print("Enter your second anagram: ");
        String anagram2 = sc.nextLine();

        char [] arr = anagram1.toLowerCase().toCharArray();
        char [] arr1 = anagram2.toLowerCase().toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        if (Arrays.equals(arr,arr1)){
            System.out.println("This is anagram");
        }else System.out.println("Its not anagram");



       // 4. Write a program to convert a string to uppercase.
        System.out.print("Enter a String: ");
        String upp = sc.next().toUpperCase();
        System.out.println(upp);


        //5. Write a program to check if a given string is a palindrome.
        System.out.println("Enter a text");
        String pld = sc.next();
        String revers = new StringBuilder(pld).reverse().toString();
        if (revers.equals(pld)){
            System.out.println("THis is palindrome");
        }else System.out.println("This is not palindrome");



        //6. Write a program to count the occurrence of a specific word in a sentence.

        //7. Write a program to remove all the white spaces from a given string

        //8. Write a program to find the length of the longest word in a sentence.

        //9. Write a program to replace all the occurrences of a specific character in a string.

        System.out.println("Enter text: ");
        String  rep = sc.next();

        System.out.println("Character to be replaced: ");
        char repl = sc.next().charAt(0);
        System.out.println("Replace character: ");
        char repl1 = sc.next().charAt(0);

        String replace = rep.replace(repl,repl1);
        System.out.println(replace);


        //10. Write a program to split a sentence into an array of words.

    }
}
