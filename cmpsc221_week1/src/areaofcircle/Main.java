package cmpsc221_week1.src.areaofcircle;

//#define PI 3.1415926

public class Main {

    // C++ constants
//    const double PI =  3.1415926;

    // Java constants
    final static double PI = 3.1415926;

    public static void main(String[] args) {

        //
        //  (1) Collect the radius
//        double radius = 5.5;
        double radius = 12.0;

        //
        //  (2) calculate the area
//        double area = 3.14 * radius *radius;
//        Main m = new Main();
        double area = PI * radius *radius;

        //
        //  (3) output the results
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);





    }

}
