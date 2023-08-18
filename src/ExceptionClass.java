import java.util.Scanner;

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");

        int num = sc.nextInt();
        System.out.println(num);

        String name = "Amirkhon";
        System.out.println("Total:" + name.length());

        //equals() takes string and returns boolean
        String st1 = "Java";
        String st2 = "Java Script";

        System.out.println(st1.equals(st2));
        System.out.println("Java".equals("java"));
    }
}
