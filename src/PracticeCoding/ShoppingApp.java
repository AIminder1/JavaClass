package PracticeCoding;
import java.util.Locale;
import java.util.Scanner;

public class ShoppingApp {
    public static void main(String[] args) {
        shoppingApp(2);
    }

    public static void shoppingApp(int itemNumber){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String item ="";
        double price;
        double total = 0.0;
        String [] itemName = {};
        int indexincrement = 0;
        for (int i = 1; i <= itemNumber; i++){

            System.out.print("Enter your item #" + i + " ");
            item = sc.nextLine();
            System.out.print("Enter price for " + item + " " );
            price = sc.nextDouble();
            total += price;
            sc.nextLine();
            indexincrement++;
        }

        System.out.println(itemName[0]);
        System.out.println(itemName[1]);
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

        for(String name : itemName){
            System.out.println(name+ "..................." + "price");
        }


        System.out.println("Total ......." + total);
    }
}
