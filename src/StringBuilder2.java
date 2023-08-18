import java.util.Scanner;

public class StringBuilder2 {
    public static void main(String[] args) {

        String name = "James";

        String name2 = new String("James");

        //
        StringBuilder name3  = new StringBuilder("James");
        System.out.println(name3);

        StringBuilder fruit = new StringBuilder("Apple");
        System.out.println(fruit);

        StringBuilder fruit2 = new StringBuilder("Manga");
        System.out.println(fruit2);

        StringBuilder text = new StringBuilder("Java is fun");
        System.out.println(text);

        //append

        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        str.append(" Wolrd!");
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");

        String text1= sc.nextLine();

        if(text1.length() > 1 ){
            System.out.println(text1.charAt(text1.length()-1));
        }else {
            System.out.println("Try again ");
        }





    }
}
