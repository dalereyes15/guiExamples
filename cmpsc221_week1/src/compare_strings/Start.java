package compare_strings;

import java.util.Scanner;

public class Start {

    public static final String REFERENCE = "Mark";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("First name: ");
        String firstName = scanner.nextLine();

        // can't overload operators in java

        //
        //  using == operator with two strings
        //  compares memory addresses of each object!!!
//        if (firstName == REFERENCE) {
//        if (firstName.equals(REFERENCE)) {
        if (firstName.equalsIgnoreCase(REFERENCE)) {
            System.out.println("Hi Mark!");
        } else {
            System.out.println("Wait, you're not mark.");
        }


    }
}
