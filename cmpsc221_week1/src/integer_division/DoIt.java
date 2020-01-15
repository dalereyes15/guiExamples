package integer_division;

public class DoIt {

    public static void main(String[] args) {

//        double foo = 5.5;
//        int num1 = (int) foo;

        if (args.length != 2) {
            System.err.println("USAGE: doit.java <num> <den>");
            System.exit(1);
        }

        int num = Integer.parseInt(args[0]);
        int den = Integer.parseInt(args[1]);

        double result = (double) (num) / den;
        System.out.println("Result: " + result);
    }


}
