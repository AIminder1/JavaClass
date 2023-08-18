package ArraysClas;

public class TwoDimensionalArrayDayTwo {
    public static void main(String[] args) {
        String [] [] twoDArray = {
                {"Orange","Lemon","Grapes","Mango"},
                {"Potato","Tomato","Broccoli","Spinach"},
                {"Cola","Fanta","Sprite","Ginger"},
                {"Honda","Tayota","Tesla","Jiguli"},
                {"Run","Nike","Adidas","Reebok"}
        };

        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }

        int [] [] numbers = {
                {10,20,30,40},
                {50,60,70,80},
                {90, 100,110,120}
        };

        for(int [] i: numbers){
            for(int j = 0; j < 3; j++){
                System.out.println(i[j]+" ");
            }
        }

        char [] [] char2D = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        for (char [] ch : char2D){
            for (int i = 0; i < 4; i++){
                System.out.print(ch[i] + " ");

            }
            System.out.println();
        }





    }
}
