import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose day 1 to 4");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday: 6pm to 9pm");
                break;
            case 2:
                System.out.println("Tuesday: 6pm to 9pm");
                break;


            default:
                if (day >= 5){
                    System.out.println("Try again!Choose 1 to 4 number");
                }

        }
    }
}
