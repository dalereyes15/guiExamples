package comparing_numbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a test score: ");
        int testScore = scanner.nextInt();
        if (testScore == 100) {
            System.out.println("You got the high score!");
        } else {
            System.out.println("Too bad");
        }
    }
}
