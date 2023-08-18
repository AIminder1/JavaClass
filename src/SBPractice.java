import java.util.Scanner;

public class SBPractice {
    public static void main(String[] args) {
        //ask user to enter a text
        // print reverse version
        //abc => cb

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");

        StringBuilder sb = new StringBuilder (sc.nextLine());
        System.out.println(sb.reverse().toString().toUpperCase());
        String result = sb.reverse().toString().toUpperCase();
        System.out.println(result);

        System.out.println("Enter a text ");
        String last = sc.nextLine();
        if (last.length() > 1){
            System.out.println(last.charAt(last.length()-1));
        }else{
            System.out.println("try again ");
        }

    }
}
