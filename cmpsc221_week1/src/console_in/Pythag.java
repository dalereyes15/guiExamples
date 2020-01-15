package console_in;

import java.util.Scanner;

//import static java.lang.Math.*;
//import static java.lang.Math.sqrt;

public class Pythag {
    public static void main(String[] args) {

        //
        //  a2 + b2 = c2
        double a, b, c;

        //
        //  console input -> Scanner
        Scanner cin = new Scanner(System.in);

        //
        //  collect a
//        cin >> a;
        System.out.print("Enter a: ");
        a = cin.nextDouble();

        System.out.print("Enter b: ");
        b = cin.nextDouble();

        //
        // Calculate C
//        c = Math.sqrt( a*a + b*b );
        c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );


        //
        //  output the result
        System.out.println("Result: " + c);

    }

}
