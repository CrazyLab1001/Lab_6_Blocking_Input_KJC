import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        System.out.println("Let's have some fun!");
        Random generator = new Random(); // input generator!
        int randomNumber = generator.nextInt(10) + 1; // 1 through 10
        int playerGuess = 0;
        do {
            System.out.println("I've picked a number 1 through 10. You have one guess! What's the number?");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                playerGuess = in.nextInt();
                if (playerGuess > randomNumber) {
                    System.out.println("Too high! The magic number was " + randomNumber + "!");
                } else if (randomNumber > playerGuess) {
                    System.out.println("Too low! The magic number was " + randomNumber + "!");
                } else {
                    System.out.println("Congrats! The magic number was the same as your guess: " + randomNumber + "!");
                }

            } else {
                String trash = in.nextLine();
                System.out.println("Oops! " + trash + " is not a valid input! Try a number, 1 through 10!");
            }
        } while (playerGuess == 0);
    }
}
