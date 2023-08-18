package ArraysClas;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int [] numbers = {5,3,2,0,8,7,5,6,1};

        //sort () - sorts the elements of an array

        for(int n : numbers){
            System.out.print(n+ ", ");
        }
        System.out.println("........................");
        //sort()
        Arrays.sort(numbers);

        for (int n: numbers){
            System.out.print(n + ", ");
        }
        System.out.println("-------------------------------");
        String [] days = {"Sun", "Tue", "Mon"};
        for (String day : days){
            System.out.println(day  + ", ");
        }

        Arrays.sort(days);
        System.out.println("_________________");
        for (String day : days){
            System.out.println(day  + ", ");
        }

        char[] alphabet = {'i', 'a','c', 'w','q'};
        for (char a : alphabet){
            System.out.print(a + ", ");
        }
        System.out.print("----------------------");
        Arrays.sort(alphabet);
        for (char a : alphabet){
            System.out.println(a + ", ");
        }

        //equals() - compares two arrays for equality;

        int [] array1 = {1,2,3,4};
        int [] array2 = {1,2,3,4};

        boolean results = Arrays.equals(array1,array2);
        System.out.println(results);


        //splice() - removes elements from an array and returns the removed elements:

        //length() - returns the length od an array:

        int [] array3= {1,2,3,4,5,6};

        System.out.println(array3.length);





















    }
}
