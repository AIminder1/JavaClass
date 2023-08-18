package ClassesAndObjectsPartOne;

import java.util.Locale;
import java.util.Scanner;

public class FinalShopApp {
    public static void main(String[] args) {

        shoppingApp(3);
    }

    public static void shoppingApp(int itemNumber){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double [] price = new double[itemNumber];
        double total = 0;
        String [] itemName = new String[itemNumber];
        int index = 0;

        for(int i = 1; i <= itemNumber; i++){
            System.out.println("Enter item #" + i + " ");
            itemName[index] = sc.nextLine();
            System.out.println("Enter price for" + " "+ itemName[index] + " ");
            price [index]= sc.nextDouble();
            /*total [index];*/
            sc.nextLine();
            index++;
        }

        System.out.println("                           ");


        System.out.println("              RECEIPT               ");
        System.out.println("                                    ");
        System.out.println("         FRESH MARKET STORE                ");
        System.out.println(" 123 Main Street, New York, NY 1111               ");
        System.out.println("       +1 (233) 444 33222");
        System.out.println("     freshmarket@shopping.com");
        System.out.println("                             ");
        System.out.println("                             ");
        System.out.println(" ***");
        System.out.println("                             ");
        System.out.println("      06/28/2023  7:08 PM              ");
        System.out.println("QTY   ITEM                     AMT");
        int number = 1;
        for(int i = 0; i < itemName.length; i++){

            System.out.println(number + ". " +itemName[i]+ "..................." + " " + price[i]);
            total += price[i];
            number++;
        }


        System.out.println("Total ......." + total);

    }

}
