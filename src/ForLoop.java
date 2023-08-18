import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        //TechNova

        String str = "Technova";

        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Please Enter your name");

        String name = sc.nextLine();

        System.out.println("First lette is " + name.charAt(0));
        System.out.println("The length of user's name is " + name.length());

        for (int i = 0; i < name.length(); i++ ){
            System.out.println("first letter is " );
        }
*//*
        int  fifth= 50;
        for (int b = 1;  b <= fifth;  b++) {
            System.out.println("Num: " + b);
        }

        int  hun = 100;
        for (int c = 50;  c <= hun;  c++) {
            System.out.println("Num: " + c);
        }



        //task 3
        int n = 100;

        int sum = 0;

        for (int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println("even num: " + i);
                sum+= i; //sum = sum+i
            }
            System.out.println(sum);
        }


        for (int i = 0; i < 10; i++){
            if ( i == 4){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Enter number");
        int series = sc.nextInt();

        System.out.println("Enter second number");
        int series2 = sc.nextInt();

        int f = 0;

        do{
            System.out.println("Please Enter a number ");
            f = sc.nextInt();
            if(f>0){
                break;
            }
        }while (true);

        n = 50;
        for ( int i = n; i >= 0; i--){
            System.out.println(i);
        }*/

/*
        int sum = 0, n = 100;

        for (int i=1; i < n; i++ ){
            System.out.println("sum1 = " + sum);
            System.out.println("i = " + i );
            sum += 1;
        }
        System.out.println(sum);
*/

/*
        int q = 0;
        while(q < 50 ) {
            q++;
            if (q % 2 == 0){
               continue;
            }
            System.out.println(q);
        }
*/

        String skip = "Java is fun is interesting";

        for (int i = 0; i < skip.length(); i++ ) {
            //System.out.println("Iteration : " + i + " ");
            if(skip.charAt(i) == 'a' || skip.charAt(i) == 'i' || skip.charAt(i) == 'e' || skip.charAt(i) == 'o' ){
                continue;
            }
            System.out.print(skip.charAt(i));
        }

    }
}
