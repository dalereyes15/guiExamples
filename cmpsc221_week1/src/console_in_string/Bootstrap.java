package console_in_string;

import java.util.Scanner;

public class Bootstrap {

    public static void main(String[] args) {

        //
        //  console in
        Scanner keyboard = new Scanner(System.in);

        //
        //  Ask user for first name
//        System.out.print("Please enter your first name: ");
        System.out.printf("Please enter your first name: ");
        String firstName = keyboard.nextLine();

        //
        //  Ask user for city
        System.out.printf("Where do you live: ");
        String city = keyboard.nextLine();

        //
        //  Ask for bank balance
        System.out.printf("How much money do you have in your account? $");
        double balance = keyboard.nextDouble();

        //
        //  Output:
//        System.out.println("Hello " + firstName + " from " + city);
        System.out.printf("Hello %s from %s ", firstName, city);

        // money format
        System.out.printf("I see your bank account with $%.2f", balance);

    }

}
