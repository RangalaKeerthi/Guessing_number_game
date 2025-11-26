import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess = 0;
        int attempts = 0;

        System.out.println("🎮 Welcome to the Java Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it? 🤔");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("📉 Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("📈 Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! The number was " + secretNumber + ".");
                System.out.println("You guessed it in " + attempts + " attempts.");
                break;
            }
        }

        input.close();
    }
}
