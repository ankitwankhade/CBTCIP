package guessNumber;
import java.util.Random;
import java.util.Scanner;
public class Guessnumber {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String playAgain;
	       
	        do {
	            playGame(scanner);
	            System.out.print("Would you like to play again? (yes/no): ");
	            playAgain = scanner.next();
	        } while (playAgain.equalsIgnoreCase("yes"));
	       
	        scanner.close();
	        System.out.println("Thank you for playing!");
	    }

	    private static void playGame(Scanner scanner) {
	        Random random = new Random();
	        int numberToGuess = random.nextInt(100) + 1;
	        int numberOfTries = 0;
	        int maxAttempts = 10;  // Limiting the number of attempts to 10
	        int points = 100;  // Initial points
	        int guess = 0;
	        boolean hasGuessedCorrectly = false;
	       
	        System.out.println("I have picked a number between 1 and 100. Can you guess what it is?");
	        System.out.println("You have " + maxAttempts + " attempts to guess the number.");
	       
	        while (!hasGuessedCorrectly && numberOfTries < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            numberOfTries++;
	           
	            if (guess < numberToGuess) {
	                System.out.println("Your guess is too low.");
	            } else if (guess > numberToGuess) {
	                System.out.println("Your guess is too high.");
	            } else {
	                hasGuessedCorrectly = true;
	                System.out.println("Congratulations! You've guessed the number.");
	                System.out.println("It took you " + numberOfTries + " tries.");
	                points -= (numberOfTries - 1) * 10;  // Deduct points based on number of attempts
	                System.out.println("Your score: " + points);
	            }
	        }
	       
	        if (!hasGuessedCorrectly) {
	            System.out.println("Sorry, you've used all your attempts. The number was: " + numberToGuess);
	            System.out.println("Your score: 0");
	        }
	    }
		}
	


