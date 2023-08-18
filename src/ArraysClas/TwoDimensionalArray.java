package ArraysClas;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {


        anagram("State","Taste");
     /*   int [] numbers = {1,2,3,4};

        int [] [] numbers2 = {{1,2,3}, {4,5,6},{1,323,32}, {123,123,123}};
        System.out.println(numbers2 [0][0]);
*/
        // create 2D array with 5 elements
        // each element should contain 4 names
        // first one: 4 names of fruits
        String [][] allFives = {{"Orange","Lemon","Grapes","Mango"},
                                {"Potato","Tomato","Broccoli","Spinach"},
                                 {"Cola","Fanta","Sprite","Ginger"},
                {"Honda","Tayota","Tesla","Jiguli"},
                {"Run","Nike","Adidas","Reebok"},
        };
        System.out.println(allFives[0][0]);
        System.out.println(allFives[0][3]);

        System.out.println(allFives[1][0]);
        System.out.println(allFives[1][3]);

        System.out.println(allFives[2][0]);
        System.out.println(allFives[2][3]);

        System.out.println(allFives[3][0]);
        System.out.println(allFives[3][3]);

        System.out.println(allFives[4][0]);
        System.out.println(allFives[4][3]);


        String one = "listen";
    }

    public static void anagram(String one, String two){
        char [] arrayOne = one.toLowerCase().toCharArray();
        char [] arrayTwo = two.toLowerCase().toCharArray();

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        if (Arrays.equals(arrayOne,arrayTwo)){
            System.out.println("This is Anagram");
        }else System.out.println("This is not Anagram");
    }
}

