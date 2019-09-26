/**
 * @author birkhoff
 * @version 02.07
 * Tester class for RecursivePalindrome
 */
import java.util.Scanner;
public class RecursivePalindromeTester {

	public static void main(String[] args) {
		
		RecursivePalindrome palindrome = new RecursivePalindrome();
		Scanner input = new Scanner(System.in);
		String string = new String();
		
		System.out.println("Please enter a string, enter \"q\" to stop:");
		while ( true ) {
			string = input.next();
			if ( string.equalsIgnoreCase("q") )
				break;
			else
				string += input.nextLine();
				if ( palindrome.isPalindrome(string) )
					System.out.println("The string you entered is palindrome!");
				else
					System.out.println("Sorry, the string you entered is not palindrome.");
		}
		input.close();
	}
}
/*
 * PMR:
 * This is pretty fun. I did some searching to get rid of all the special characters out. And it turned out to be working.
 * It is actually the first time I used String.replaceAll and String.charAt functions.
 */
