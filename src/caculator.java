public class caculator {
    //1. Create a method that does addition
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    //2. create a method that deducts one number from another one
    public void deduct(int a , int b){
        System.out.println(a-b);
    }

    //3. Create a method that multiplies 2 numbers
    public static int multiply(int a, int b){
        return a*b;
    }

    //4. Create a method that divides 2 number
    public int divide(float a, float b){
        int c = (int)(a/b); //
        return c;
    }

    public static double calculateCircleArea(double radius){
        double area = 3.14159 * (radius * radius);
        return area;
    }

    public static void printMessage (String str, int count){
        for(int i = 0; i< count; i++){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String mystr = "Java is fun";
        int myint = 10;
        printMessage(mystr,myint);
    }

    public static void swapVariables(int a, int b){
        int empty = a;

        a = b;
        b = empty;
        System.out.println("a is "  + a);
        System.out.println("b is " + b);


    }

}










class body {
    public static void main(String[] args) {
        //c is the object of calculator class, it is called instantiontion of the class
        caculator c = new caculator();
        //calling static method
        caculator.add(500, 20);

        //calling non-static method
        c.divide(354,3534534);
        ///
        caculator.multiply(3,6);
        ///
        c.deduct(325, 345);




    }
}
