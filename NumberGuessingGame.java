import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        System.out.println("Welcome to Number Guessing Game!");
        do {
            int number = rand.nextInt(100) + 1;
            int attempts = 7;
            boolean win = false;

            System.out.println("\nGuess a number between 1 and 100 (You have " + attempts + " tries):");
            while (attempts-- > 0) {
                int guess = sc.nextInt();
                if (guess == number) {
                    System.out.println("Correct! You guessed it.");
                    score += (10 - (7 - attempts));
                    win = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high! Attempts left: " + attempts);
                } else {
                    System.out.println("Too low! Attempts left: " + attempts);
                }
            }
            if (!win) System.out.println("Out of attempts! The number was: " + number);

            System.out.println("Your score: " + score);
            System.out.print("Play again? (yes/no): ");
        } while (sc.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! Final Score: " + score);
        sc.close();
    }
}
