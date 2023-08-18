public class CicleCalculator {
    public static double calculateCircleArea(double radius){
       double area = radius*2;
       return area;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = calculateCircleArea(radius);
        System.out.println("The area of the circle with " + radius);
    }



    //isEvenNumber

    public boolean isEvenNumber(int i){
        if(i % 2 == 0){
            return true;

        }else{
            return false;
        }
    }



}


