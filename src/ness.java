import java.util.Scanner;

public class ness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of rows for the pattern ");

        int n = sc.nextInt();

        //Pattenr Printing
        for(int i=1; i<=n; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
