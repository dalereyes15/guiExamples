package uppercase_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.printf("First name: ");
        String firstName = keyboard.nextLine();

        // upper case the string
//        for (int i=0; i<firstName.length(); i++) {
//            System.out.println(Character.toUpperCase(firstName.charAt(i)));
//        }
        System.out.printf("%s \n", firstName.toUpperCase());


    }
}
