/**
 * Purpose: Advanced guessing game
 * 
 * @author Birkhoff Cheng
 * @version 0.0.2
 * PMR:
 * I just used printf on one line
 * and didn't realized until I saw an error when compiling.
 * have to adapt.
 */
import java.util.Scanner;
public class GuessingGameV2
{
	public static void main(String[] args)
	{
		//setting scanner
		Scanner in = new Scanner(System.in);
		
		//get user input about range
		System.out.print("We are going to play guessing game! Enter the minimum possible number (integer): ");
		String minStr = in.next();
		int min = Integer.parseInt(minStr);
		System.out.print("Now the maximum: ");
		String maxStr = in.next();
		int max = Integer.parseInt(maxStr);
		if ( min > max ) {
			System.out.println("Invalid Input!");
			return;
		}
		
		//declaring variables
		int random = (int) ( Math.random() * (max - min) + min );
		System.out.println("We have generated a random integer between " + min + " and " + max + ". Guess what it is!");
		boolean correct = false;
		String guessStr;
		int guess;
		int numberOfGuesses = 0;

		//guess
		while ( !correct ) {
			System.out.print("Enter your guess: ");
			guessStr = in.next();
			guess = Integer.parseInt(guessStr);
			numberOfGuesses++;
			if ( guess == random ) {
				correct = true;
				System.out.println("Congratulations!\nThe random number was " + random);
				System.out.println("Number of guesses: " + numberOfGuesses);
			} else if ( guess <= max && guess > random ) {
				System.out.println("Too high");
			} else if ( guess >= min && guess < random ) {
				System.out.println("Too low");
			} else {
				System.out.println("Invalid input! Please enter an integer between 1 and 100!");
			}
		}
	}
}
