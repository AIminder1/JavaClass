public class LoopPractice {

    public static void main(String[] args) {

        //Task a program to find the sum
        //Of all even numbers between 1 and 100 using a do-while loop



        // do while loop
        int sum = 0;
        int num = 1;
        do{
            if(num % 2 == 0){
                sum += num;
            }
            num++;
        }while(num<=100);

        System.out.println("Sum of the all even numbers 1 - 100 is " + sum);

        //for loop
        int total = 0;
        for (int i = 1; i<= 100; i++){
            if (i % 2 == 0){
                total += i;
            }

        }

        System.out.println("Sum of the all even numbers 1 - 100 is " + total);

        //while loop
        int x = 0;
        int y = 1;

        while(y<= 100){
            if(y % 2 == 0){
                x += y;
            }
            y++;
        }
        System.out.println("Sum of the all even numbers 1 - 100 is " + x);

        // Write a Java program to reverse a given string using a while loop

        String text = "Java";
        int textLength = text.length();
        String reverse = "";

        while(textLength > 0 ){
            reverse += text.charAt(textLength-1);
            textLength--;
        }

        System.out.println(reverse);

        for (int j = text.length()-1; j >= 0; j-- ){

            reverse += text.charAt(j);
        }

        System.out.println(reverse);


        reverse= "";
        int i = text.length();
        do{
            reverse += text.charAt(i-1);

            i--;
        }while(i>0);
        System.out.println(reverse);
    }
}
