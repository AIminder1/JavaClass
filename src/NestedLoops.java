import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

/*
        //outer loop
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            //inner loop
            for(int j = 1; j <= 10; j++){
                System.out.println("  inner loop:   " + j);
            }
        }
*/

        int num = 20 ;

        for (int i = 0; i<=num; i++){
            if(i % 2 == 0){
                System.out.println("Even Num: " + i);
            }
        }

       /* int num2 = 20;
        for (int i = 1; i <=num2; i++){
            System.out.println(i);
            //inner one
            for (int o = 2; o <= i; i++){
                System.out.print(o);
                for (int t = 3; t <= o; i++){
                    System.out.print(t);
                }
            }
        }*/

        //Create a nested for loop program

        int ott = 123;
        int five = 3;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Week" + " "+ i);
            for (int q = 1; q <= 7; q++){
                System.out.println(q + " " + "Day");
            }

        }
        int a = 1;
        int weeks =3;
        int days = 7;

        while(a <= weeks){

            System.out.println("Week" + a);
            a++;

            //inner loop
            for (int i = 1; i<=days; i++){

              switch (i){
                  case 1:
                      System.out.println("    Monday");
                      break;
                  case 2:
                      System.out.println("    Tuesday");
                      break;
                  case 3:
                      System.out.println("    Wednesday");
                      break;
                  case 4:
                      System.out.println("    Thursday");
                      break;
                  case 5:
                      System.out.println("    Friday");
                      break;
                  case 6:
                      System.out.println("    Suturday");
                      break;
                  case 7:
                      System.out.println("    Sunday");
                      break;
              }
            }
        }



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of rows for the pattern ");

        int n = sc.nextInt();

        //Pattenr Printing
        for(int i=1; i<=n; i++){
            for(int j = 1 ; j <= i; i++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
