
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("RANDOM NUMBER GUESSING GAME");
        System.out.println("Guess a number between 1 and 100.");

        // Repeat until the correct number is guessed
        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess > number) {
                System.out.println("Too high, try again.");
            }
            else if (guess < number) {
                System.out.println("Too low, try again.");
            }
            else {
                System.out.println("Congratulations! You guessed correctly.");
            }

        } while (guess != number);

        input.close();
    }
}
