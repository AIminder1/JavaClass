import java.util.Random;

public class randomgenerate {
    //Generate Random Number. Create a method called generateRandomNumber that takes two integer parameters,
    // min and max, and returns a random number between min (inclusive) and max (inclusive).​

    public static int generateRandomNumber(int min, int max){
        Random random = new Random();
        int randomNumber = random.nextInt((max - min +1)-min);
        return randomNumber;
    }

}
 class buddy {
     public static void main(String[] args) {


         int randomNumber = randomgenerate.generateRandomNumber(1,100);
         System.out.println("random number:" + randomNumber);

     }





}