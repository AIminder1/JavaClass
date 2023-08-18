package ArraysClas;

public class ArraysClass2 {
    public static void main(String[] args) {

        //First Way
        int[] num1 = new int[3];
        num1[0] = 10;
        num1[1] = 20;
        num1[2] = 30;

        System.out.println(num1[1]);

        //SECOND WAY
        int[] num2 = {10,20,30,40,};

        System.out.println(num1[0] + " | " + num2[0]);

        char [] vowels = {'a', 'e', 'o', 'u' , 'i'};
        System.out.println(vowels[0]);
        System.out.println(vowels[1]);
        System.out.println(vowels[2]);
        System.out.println(vowels[3]);
        System.out.println(vowels[4]);


        //Create an Arrys with 10
        // String elements and print out all the element values in console

        String [] animal = {"Lion", "Tiger","Wolf","Jaguar","Dog",
                            "Cat","Crocodile","Monkey","Zebra","Panda"};


        for (int i = 0; i<animal.length; i++){
            System.out.print(animal[i] + ", ");
        }

        for (String a : animal){
            System.out.println(a);
        }


        for (int i = 0; i<vowels.length; i++){
            System.out.print(vowels[i]);
        }

        int [] number = {30,40,50,60,70,80,90,100};
        for (int num : number){
            System.out.println(num);
        }

        char [] vowel1 = {'a', 'e', 'o', 'u' , 'i'};

        for(char vowel : vowel1){
            if (vowel == 'a'){
                System.out.println("THere is an a in this array");
            }else System.out.println("Not found!");
        }

        boolean [] boolArray = {true, false};


    }
}
