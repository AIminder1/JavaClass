import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        int monthNumber = 13;

        switch (monthNumber){
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;

            case 6, 7, 8:
                System.out.println("Autumn");
                break;
            case 9, 10, 11:
                System.out.println("Summer");
                break;
        }

    }
}
